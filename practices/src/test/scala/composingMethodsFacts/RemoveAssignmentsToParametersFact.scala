package composingMethodsFacts

import composingMethods.RemoveAssignmentsToParameters
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.{Matchers, FunSpec}

@RunWith(classOf[JUnitRunner])
class RemoveAssignmentsToParametersFact extends FunSpec with Matchers{
  describe("RemoveAssignmentsToParametersFact") {
    it("should_get_discount_7_given_value_is_over_50_and_quantity_is_over_100_and_yearToEnd_is_over_10000") {
      val removeAssignmentsToParameters = new RemoveAssignmentsToParameters();
      removeAssignmentsToParameters.Discount(60, 200, 20000) should be(53)
    }

    it("should_get_discount_5_given_value_is_less_than_50_and_quantity_is_over_100_and_yearToEnd_is_over_10000") {
      val removeAssignmentsToParameters = new RemoveAssignmentsToParameters();
      removeAssignmentsToParameters.Discount(40, 200, 20000) should be(35)
    }
  }
}
