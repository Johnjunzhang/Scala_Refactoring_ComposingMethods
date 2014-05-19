package composingMethods

class IntroduceExplainingVariableExample1 {
  def isResizableIEInMac(platform:String, browser:String, resize:Int):Boolean = {
    platform.indexOf("MAC") > -1 && browser.indexOf("IE") > -1 && resize > 0;
  }
}
