package shapeLibrary

class Square(topLeftPoint: Point, sideLength: Double) : Rectangle(topLeftPoint, Point(topLeftPoint.getX() + sideLength, topLeftPoint.getY() + sideLength)) {
    init {
        require(sideLength > 0 ) { "A square cannot have zero size." }
    }
}
