package composingMethodsFacts

import composingMethods.InlineMethod
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.{FunSpec, Matchers}

@RunWith(classOf[JUnitRunner])
class InlineMethodsFact extends FunSpec with Matchers {
  describe("InlineMethodsFact") {
    it("should_get_rating_2_given_more_than_five_late_deliveries") {
      val numberOfLateDeliveries = 6;
      val inlineMethod = new InlineMethod(numberOfLateDeliveries);
      inlineMethod.getRating should be(2)
    }

    it("should_get_rating_1_given_less_than_five_late_deliveries") {
      val numberOfLateDeliveries = 4;
      val inlineMethod = new InlineMethod(numberOfLateDeliveries);
      inlineMethod.getRating should be(1)
    }
  }
}
