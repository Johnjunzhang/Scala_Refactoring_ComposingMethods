package composingMethods

import composingMethods.referenceClasses.Order

class ExtractMethods(orders:List[Order]) {

  def printOwning(name:String, previousAmount:Int):String =
  {
    var customerOwns = "";
    var outstanding = 10 + previousAmount;

    // print banner
    customerOwns += "****/n";
    customerOwns += "**Customer Owns**/n";
    customerOwns += "****/n";

    // calculate outstanding
    val sum = orders.map(_.getAmount).sum
    outstanding += sum;

    //print details
    customerOwns += "name:" + name + "/n";
    customerOwns += "amount:" + outstanding;
    customerOwns;
  }
}
