package composingMethodsFacts

import composingMethods.ReplaceTempWithQuery
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.{Matchers, FunSpec}

@RunWith(classOf[JUnitRunner])
class ReplaceTempWithQueryFact extends FunSpec with Matchers {
  describe("ReplaceTempWithQueryFact") {
    it("should_get_right_discount_given_base_price_is_over_1000") {
      val replaceTempWithQuery = new ReplaceTempWithQuery(1000, 2);
      replaceTempWithQuery.getPrice should be(1900)
    }

    it("should_get_right_discount_given_base_price_is_less_than_1000") {
      val replaceTempWithQuery = new ReplaceTempWithQuery(400, 2);
      replaceTempWithQuery.getPrice should be(784)
    }
  }
}
