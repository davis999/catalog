package io.reactivesw.catalog.rpcserver

import com.google.protobuf.Empty

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
}
