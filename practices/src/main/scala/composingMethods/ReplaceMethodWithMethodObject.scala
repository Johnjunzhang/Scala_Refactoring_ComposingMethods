package composingMethods

class ReplaceMethodWithMethodObject {
  def gamma(inputVal:Int, quantity:Int, yearToDate:Int):Int = {
    val importantValue1 = inputVal * quantity;
    var importantValue2 = inputVal * yearToDate + 100;
    if ((yearToDate - importantValue1) > 100)
      importantValue2 -= 20;
    val importantValue3 = importantValue2 * 7;
    importantValue3 - 2 * importantValue1;
  }
}
