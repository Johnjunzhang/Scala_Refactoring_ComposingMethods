package composingMethodsFacts

import composingMethods.ExtractMethods
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.{Matchers, FunSpec}
import composingMethods.referenceClasses.Order

@RunWith(classOf[JUnitRunner])
class ExtractMethodsFact extends FunSpec with Matchers{
  describe("ExtractMethodsFact"){
    it("should_get_right_customer_owns") {
      val expectedCustomerOwns:String = "****/n**Customer Owns**/n****/nname:ExtractMethod/namount:140";
      val orders = List[Order](new Order(10), new Order(20));
      val extractMethods = new ExtractMethods(orders);
      val owns = extractMethods.printOwning("ExtractMethod", 100);
      owns should be(expectedCustomerOwns);
    }
  }
}
