package composingMethods

import composingMethods.referenceClasses.Order

class InlineTemp(amount:Int) {
  val order = new Order(amount);

  def IsAmountOver1000:Boolean = {
    val amount = order.getAmount;
    amount > 1000;
  }
}
