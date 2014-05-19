package composingMethodsFacts

import composingMethods.{IntroduceExplainingVariableExample2, IntroduceExplainingVariableExample1}
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.{Matchers, FunSpec}

@RunWith(classOf[JUnitRunner])
class IntroduceExplainingVarialbeFact extends FunSpec with Matchers{
  describe("IntroduceExplainingVarialbeFact"){
    it("should_get_true_given_platform_is_MAC_and_browser_is_IE_and_resize_is_1") {
      val introduceVariable = new IntroduceExplainingVariableExample1;
      introduceVariable.isResizableIEInMac("MAC", "IE", 1) should be(true)
    }

    it("should_get_false_given_platform_is_Windows_and_browser_is_Chrome_and_resize_is_0") {
      val introduceVariable = new IntroduceExplainingVariableExample1;
      introduceVariable.isResizableIEInMac("Windows", "Chrome", 0) should be(false)
    }

    it("should_get_right_given_quantity_is_1000_and_item_price_is_2") {
      val introduceVariable = new IntroduceExplainingVariableExample2(1000, 2);
      introduceVariable.getPrice should be(2050)
    }

    it("should_get_right_given_quantity_is_200_and_item_price_is_60") {
      val introduceVariable = new IntroduceExplainingVariableExample2(200, 2);
      introduceVariable.getPrice should be(440)
    }
  }
}
