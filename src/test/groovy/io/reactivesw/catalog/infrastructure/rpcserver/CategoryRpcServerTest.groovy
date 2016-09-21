package io.reactivesw.catalog.infrastructure.rpcserver

import com.google.protobuf.Empty
import com.google.protobuf.Int64Value
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver
import io.reactivesw.catalog.domain.entity.Category
import io.reactivesw.catalog.infrastructure.exception.CatalogRuntimeException
import io.reactivesw.catalog.domain.service.CategoryService

import spock.lang.Specification

class CategoryRpcServerTest extends Specification{
  def categoryService = Mock(CategoryService)
  def categoryRpcServer = new CategoryRpcServer(categoryService:categoryService)
  List<Category> categories
  def category
  def longInput
  def emptyInput
  def outputData
  def setup(){
    categories = new ArrayList<Category>()
    category = new Category()
    category.setId(1001L);
    category.setName("Feature");
    category.setDescription("this is feature product");
    category.setCreatedTime(new Date());
    category.setModifiedTime(new Date());
    category.setDisplayOrder(0);
    categories.add(category)

    longInput = Int64Value.newBuilder().setValue(10086L).build()
    emptyInput = Empty.newBuilder().build()
    outputData = Mock(StreamObserver)
  }

  def "test get all top category"(){

    given:
    categoryService.findAllCategories() >> categories

    when:
    categoryRpcServer.getCategories(emptyInput, outputData)
    then:
    noExceptionThrown()
  }

  def "test get all top category and no result"(){
    given:
    categoryService.findAllCategories() >> { throw new CatalogRuntimeException() }

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
    categoryService.findCategoryById(_) >> { throw new CatalogRuntimeException() }

    when:
    categoryRpcServer.getCategoryById(longInput, outputData)

    then:
    thrown(StatusRuntimeException)
  }
}
