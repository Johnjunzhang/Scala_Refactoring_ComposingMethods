package composingMethods

class SubstitueAlgorithm() {
  def foundPerson(people:List[String]):String = {
    for (i <- 0 to people.length - 1) {
      if (people(i).equals("Don"))
        return "Don";

      if (people(i).equals("John"))
        return "John";

      if (people(i).equals("Kent"))
        return "Kent";
    }

    return "";
  }
}