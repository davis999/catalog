package io.reactivesw.catalog.infrastructure.rpcserver

import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver
import io.reactivesw.catalog.domain.entity.Category
import io.reactivesw.catalog.domain.service.CategoryService
import io.reactivesw.catalog.grpc.Empty
import io.reactivesw.catalog.grpc.LongValue
import io.reactivesw.catalog.infrastructure.exception.NotFoundException
import spock.lang.Specification

import java.time.ZoneOffset
import java.time.ZonedDateTime

class CategoryRpcServerTest extends Specification{
  def categoryService = Stub(CategoryService)
  def categoryRpcServer = new CategoryRpcServer(categoryService:categoryService)
  List<Category> categories
  def category
  def longInput
  def emptyInput
  def outputData
  def setup(){
    ZonedDateTime createdTime = ZonedDateTime.now(ZoneOffset.UTC)
    categories = new ArrayList<Category>()
    category = new Category()
    category.setId(1001L);
    category.setName("Feature");
    category.setDescription("this is feature product");
    category.setCreatedTime(createdTime);
    category.setModifiedTime(createdTime);
    category.setDisplayOrder(0);
    categories.add(category)

    longInput = LongValue.newBuilder().setValue(10086L).build()
    emptyInput = Empty.newBuilder().build()
    outputData = Mock(StreamObserver)
  }

  def "test get all top category"(){

    given:
    categoryService.getAllCategories() >> categories

    when:
    categoryRpcServer.getCategories(emptyInput, outputData)
    then:
    noExceptionThrown()
  }

  def "test get all top category and no result"(){
    given:
    categoryService.getAllCategories() >> { throw new NotFoundException() }

    when:
    categoryRpcServer.getCategories(emptyInput, outputData)
    then:
    thrown(StatusRuntimeException)
  }

  def "test get a category by it's id"(){
    given:
    categoryService.findCategoryById(_) >> category

    when:
    categoryRpcServer.getCategoryById(longInput, outputData)
    then:
    noExceptionThrown()
  }

  def "test get a category without result"(){
    given:
    categoryService.findCategoryById(_) >> { throw new NotFoundException() }

    when:
    categoryRpcServer.getCategoryById(longInput, outputData)

    then:
    thrown(StatusRuntimeException)
  }
}
