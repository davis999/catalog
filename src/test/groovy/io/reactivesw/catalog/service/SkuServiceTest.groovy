package io.reactivesw.catalog.service

import io.reactivesw.catalog.domain.entity.Category
import io.reactivesw.catalog.domain.entity.Sku
import io.reactivesw.catalog.domain.service.SkuService
import io.reactivesw.catalog.infrastructure.exception.NotFoundException
import io.reactivesw.catalog.infrastructure.exception.NullParameterException
import io.reactivesw.catalog.infrastructure.exception.SkuNotActiveException
import io.reactivesw.catalog.infrastructure.repository.SkuRepository
import spock.lang.Specification

import java.time.ZoneOffset
import java.time.ZonedDateTime

class SkuServiceTest extends Specification {

    SkuService skuService = new SkuService();
    SkuRepository skuRepository = Mock();
    Sku savedSku = new Sku();
    List<Sku> allSkus = new ArrayList<Sku>();
    Set<Sku> skuSet = new HashSet<Sku>();

    def setup() {
        savedSku.setId(1L)
        savedSku.setSkuNumber("BBK-001")
        savedSku.setActive(true)
        savedSku.setPrice(new BigDecimal("19.99"))
        savedSku.setQuantity(10086)

        skuService.skuRepository = skuRepository
    }

    def "test query quantity and get quantity"() {
        given:
        skuRepository.findOne(_) >> savedSku

        when: "save category"
        int skuQuantity = skuService.queryQuantity(1L)

        then:
        skuQuantity == savedSku.getQuantity();
    }

    def "test query quantity and get null sku"() {
        given:
        skuRepository.findOne(_) >> null

        when: "save category"
        int skuQuantity = skuService.queryQuantity(1L)

        then:
        thrown(NotFoundException)
    }

    def "test query quantity and get not-active sku"() {
        given:
        savedSku.setActive(false)
        skuRepository.findOne(_) >> savedSku

        when: "save category"
        int skuQuantity = skuService.queryQuantity(1L)

        then:
        thrown(SkuNotActiveException)
    }

    def "test query sku by id and get result"() {
        given:
        skuRepository.findOne(_) >> savedSku

        when:
        Sku sku = skuService.querySkuById(1L)

        then:
        sku == savedSku
    }

    def "test query sku by id and get null"() {
        given:
        skuRepository.findOne(_) >> null

        when:
        Sku sku = skuService.querySkuById(1L)

        then:
        thrown(NotFoundException)
    }

    def "test query sku by id and get not-active sku"() {
        given:
        savedSku.setActive(false)
        skuRepository.findOne(_) >> savedSku

        when:
        Sku sku = skuService.querySkuById(1L)

        then:
        thrown(SkuNotActiveException)
    }

    def "query list sku"() {
        given:
        allSkus.add(savedSku)
        skuRepository.findAll(_) >> allSkus

        when:
        List<Sku> skus = skuService.queryListSku(_)

        then:
        skus.size() == allSkus.size()

        when: "list of id is null"
        skuService.queryListSku(null)

        then:
        thrown(NullParameterException)

        when: "list of id is empty"
        skuService.queryListSku(new ArrayList<Long>())

        then:
        thrown(NullParameterException)
    }

    def "query list sku and return empty list"() {
        given:
        skuRepository.findAll(_) >> null

        when:
        List<Sku> skus = skuService.queryListSku(_)

        then:
        skus.isEmpty() == true
    }

    def "query list sku and get not-active sku"() {
        given:
        savedSku.setActive(false)
        allSkus.add(savedSku)
        skuRepository.findAll(_) >> allSkus

        when:
        List<Sku> skus = skuService.queryListSku(_)

        then:
        skus.size() < allSkus.size()
    }

    def "query sku by number and get list of sku"() {
        given:
        def skuNumber = "sku_number"
        skuRepository.findOneBySkuNumber(_) >> allSkus

        when:
        def skus = skuService.querySkuByNumber(skuNumber)

        then:
        skus != null
    }

    def "query sku by number and get null list"(){
        given:
        def skuNumber = "sku_number"
        skuRepository.findOneBySkuNumber(_) >> null

        when:
        def skus = skuService.querySkuByNumber(skuNumber)

        then:
        thrown(NotFoundException)
    }

}
