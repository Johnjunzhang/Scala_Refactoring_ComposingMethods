package composingMethodsFacts

import composingMethods.{SubstitueAlgorithm, SplitTemporaryVariable}
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.{Matchers, FunSpec}

@RunWith(classOf[JUnitRunner])
class SubstitueAlgorithmFact extends FunSpec with Matchers {
  describe("SubstitueAlgorithmFact") {
    it("should_find_don_given_there_is_don_in_people_list") {
      val peopleList = List("Don", "Done", "Do");
      val substitueAlgorithm = new SubstitueAlgorithm();
      substitueAlgorithm.foundPerson(peopleList) should be("Don");
    }

    it("should_find_john_given_there_is_john_in_people_list") {
      val peopleList = List("John", "Joh", "Jo");
      val substitueAlgorithm = new SubstitueAlgorithm();
      substitueAlgorithm.foundPerson(peopleList) should be("John");
    }

    it("should_find_kent_given_there_is_kent_in_people_list") {
      val peopleList = List("Kent", "Ken", "Ke");
      val substitueAlgorithm = new SubstitueAlgorithm();
      substitueAlgorithm.foundPerson(peopleList) should be("Kent");
    }

    it("should_not_find_people_given_there_is_no_matched_name_in_people_list") {
      val peopleList = List("Done", "Do");
      val substitueAlgorithm = new SubstitueAlgorithm();
      substitueAlgorithm.foundPerson(peopleList) should be("");
    }
  }
}
