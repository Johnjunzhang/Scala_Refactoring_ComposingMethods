package composingMethods

class SplitTemporaryVariable() {
  def setPerimeterAndArea(height: Double, width: Double) {
    var temp = 2 * (height + width);
    setDoublePerimeter(temp);
    temp = height * width;
    setDoubleArea(temp);
  }

  var doubleArea: Double = 0;

  private def setDoubleArea(value: Double) = {
    doubleArea = value * 2;
  }

  var doublePerimeter: Double = 0;

  private def setDoublePerimeter(value: Double) {
    doublePerimeter = value * 2;
  }
}