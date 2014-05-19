package composingMethods

class ReplaceTempWithQuery(quantity:Double, itemPrice:Double) {
  def getPrice:Double = {
    val basePrice = quantity * itemPrice;
    var discountFactor:Double = 0;
    if (basePrice > 1000)
      discountFactor = 0.95;
    else
      discountFactor = 0.98;

    basePrice * discountFactor;
  }
}
