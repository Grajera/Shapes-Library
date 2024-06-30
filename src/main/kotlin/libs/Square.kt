package libs

class Square(topLeft: Point, sideLength: Double) : Rectangle(topLeft, Point(topLeft.getX() + sideLength, topLeft.getY() + sideLength)) {
    init {
        require(sideLength > 0 ) { "A square cannot have zero size." }
    }
}
