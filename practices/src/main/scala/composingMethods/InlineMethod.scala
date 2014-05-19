package composingMethods

class InlineMethod(numberOfLateDeliveries:Double) {
  def getRating:Int =
  {
     if (MoreThanFiveLateDeliveries) 2 else 1;
  }

  private def MoreThanFiveLateDeliveries:Boolean =
  {
     numberOfLateDeliveries > 5;
  }
}
