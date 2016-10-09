package io.reactivesw.catalog.infrastructure.utils;

import spock.lang.Specification;

import java.math.BigDecimal;

/**
 * Created by Davis on 16/10/9.
 */
public class DecimalFormatUtilsTest extends Specification {
  def "test transfer to string and remove uselese 0"(){
    given:
    String target = "3.5"
    def decimal = new BigDecimal(target + "00000000000")

    when:
    DecimalFormatUtils decimalFormatUtils = new DecimalFormatUtils()
    String string = DecimalFormatUtils.transferToShortString(decimal)

    then:
    string == target
  }
}
