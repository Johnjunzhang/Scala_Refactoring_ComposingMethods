package composingMethodsFacts

import composingMethods.SplitTemporaryVariable
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.{Matchers, FunSpec}

@RunWith(classOf[JUnitRunner])
class SplitTemporaryVariableFact extends FunSpec with Matchers {
  describe("SplitTemporaryVariableFact") {
    it("should_set_right_perimeter_and_area") {
      val splitTemporaryVariable = new SplitTemporaryVariable();
      splitTemporaryVariable.setPerimeterAndArea(20, 10);
      splitTemporaryVariable.doublePerimeter should be(120);
      splitTemporaryVariable.doubleArea should be(400);
    }
  }
}
