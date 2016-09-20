package io.reactivesw.catalog.rpcserver

import com.google.protobuf.Empty
import com.google.protobuf.Int64Value
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver
import io.reactivesw.catalog.domain.Category
import io.reactivesw.catalog.exception.CatalogRuntimeException
import io.reactivesw.catalog.service.CategoryService

import spock.lang.Specification

class CategoryRpcServerTest extends Specification{
  def categoryService = Mock(CategoryService)
  def categoryRpcServer = new CategoryRpcServer(categoryService:categoryService)
  Set<Category> categories
  def category
  def longInput
  def emptyInput
  def outputData
  def setup(){
    categories = new HashSet<Category>()
    category = new Category()
    category.setId(1001L);
    category.setName("Feature");
    category.setDescription("this is feature product");
    category.setCreateTime(new Date());
    category.setLastModifiedTime(new Date());
    category.setDisplayOrder(0);
    category.setDepth(0);
    categories.add(category)

    longInput = Int64Value.newBuilder().setValue(10086L).build()
    emptyInput = Empty.newBuilder().build()
    outputData = Mock(StreamObserver)
  }

  def "test get all top category"(){

    given:
    categoryService.findAllTopCategories() >> categories

    when:
    categoryRpcServer.getCategories(emptyInput, outputData)
    then:
    noExceptionThrown()
    1 * categoryService.findAllTopCategories()
  }

  def "test get all top category and no result"(){
    given:
    categoryService.findAllTopCategories() >> { throw new CatalogRuntimeException() }

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
