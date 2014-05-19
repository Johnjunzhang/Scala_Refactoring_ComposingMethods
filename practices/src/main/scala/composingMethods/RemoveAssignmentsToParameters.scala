package composingMethods

class RemoveAssignmentsToParameters {
  def Discount(inputVal: Int, quantity: Int, yearToDate: Int): Int = {
    var discount = inputVal;
    if (inputVal > 50) discount -= 2;
    if (quantity > 100) discount -= 1;
    if (yearToDate > 10000) discount -= 4;
    discount;
  }
}
