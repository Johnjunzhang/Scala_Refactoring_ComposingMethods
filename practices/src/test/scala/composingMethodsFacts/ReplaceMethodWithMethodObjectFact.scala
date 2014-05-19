package composingMethodsFacts

import composingMethods.ReplaceMethodWithMethodObject
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.{Matchers, FunSpec}

@RunWith(classOf[JUnitRunner])
class ReplaceMethodWithMethodObjectFact extends FunSpec with Matchers {
  describe("ReplaceMethodWithMethodObjectFact") {
    it("should_get_right_gamma_given_create_a_gamma_class") {
      val replaceMethodWithMethodObject = new ReplaceMethodWithMethodObject();
      val gamma = replaceMethodWithMethodObject.gamma(10, 5, 100);
      gamma should be(7600)
    }
  }
}
