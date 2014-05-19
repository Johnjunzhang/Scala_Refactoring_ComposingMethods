package composingMethodsFacts

import composingMethods.InlineTemp
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.{Matchers, FunSpec}

@RunWith(classOf[JUnitRunner])
class InlineTempFact extends FunSpec with Matchers {
  describe("InlineTempFact") {
    it("should_get_true_given_amount_over_1000") {
      val inlineTemp = new InlineTemp(2000);
      inlineTemp.IsAmountOver1000 should be(true)
    }

    it("should_get_false_given_amount_less_than_1000") {
      val inlineTemp = new InlineTemp(500);
      inlineTemp.IsAmountOver1000 should be(false)
    }
  }
}
