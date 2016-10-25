package io.reactivesw.catalog.application

import io.reactivesw.catalog.domain.entity.Sku
import io.reactivesw.catalog.domain.service.SkuService
import io.reactivesw.catalog.infrastructure.dto.SkuDetailDTO
import io.reactivesw.catalog.infrastructure.exception.NotFoundException
import io.reactivesw.catalog.infrastructure.initial.ProductDataInitial
import io.reactivesw.catalog.infrastructure.repository.SkuRepository
import spock.lang.Specification

/**
 * Created by Davis on 16/10/25.
 */
class SkuApplicationTest extends Specification {
    SkuRepository skuRepository = Mock()
    SkuService skuService = new SkuService(skuRepository: skuRepository)
    def sku
    def skuNumber = ""
    def skuApplication = new SkuApplication(skuService: skuService)

    def "test getSkuDetailByNumber"() {
        given:
        def product = ProductDataInitial.getProduct()
        sku = product.getAdditionalSkus().iterator().next()
        skuRepository.findOneBySkuNumber(_) >> sku

        when:
        SkuDetailDTO skuDetailDTO = skuApplication.getSkuDetailByNumber(skuNumber)

        then:
        skuDetailDTO != null
    }

    def "test getSkuDetailByNumber and feature attribute and media is null"() {
        given:
        def product = ProductDataInitial.getProduct()
        product.setFeatures(null)
        product.setAttributeValues(null)
        sku = product.getAdditionalSkus().iterator().next()
        sku.setMedias(null)
        skuRepository.findOneBySkuNumber(_) >> sku

        when:
        SkuDetailDTO skuDetailDTO = skuApplication.getSkuDetailByNumber(skuNumber)

        then:
        skuDetailDTO != null
    }

    def "test getSkuDetailByNumber and sku is not active"() {
        given:
        def product = ProductDataInitial.getProduct()
        sku = product.getAdditionalSkus().iterator().next()
        sku.setActive(false)
        skuRepository.findOneBySkuNumber(_) >> sku

        when:
        SkuDetailDTO skuDetailDTO = skuApplication.getSkuDetailByNumber(skuNumber)

        then:
        skuDetailDTO != null
    }

    def "test getSkuDetailByNumber and sku is default sku"() {
        given:
        def product = ProductDataInitial.getProduct()
        sku = product.getAdditionalSkus().iterator().next()
        sku.setDefaultProduct(product)
        sku.setActive(false)
        skuRepository.findOneBySkuNumber(_) >> sku

        when:
        SkuDetailDTO skuDetailDTO = skuApplication.getSkuDetailByNumber(skuNumber)

        then:
        skuDetailDTO != null
    }

    def "test get sku detail by sku number and get null sku"() {
        given:
        sku = null
        skuRepository.findOneBySkuNumber(_) >> sku

        when:
        SkuDetailDTO skuDetailDTO = skuApplication.getSkuDetailByNumber(skuNumber)

        then:
        thrown(NotFoundException)
    }

}
