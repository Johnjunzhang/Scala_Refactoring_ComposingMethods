package composingMethods

class IntroduceExplainingVariableExample2(quantity:Int, itemPrice:Double) {
  def getPrice: Double = {
    // price is base price - quantity discount + shipping
    quantity * itemPrice -
      Math.max(0, quantity - 500) * itemPrice * 0.05 +
      Math.min(quantity * itemPrice * 0.1, 100.0);
  }
}
