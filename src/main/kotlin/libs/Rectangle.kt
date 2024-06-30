package libs

open class Rectangle(private val topLeft: Point, private val bottomRight: Point) {
    init {
        require(topLeft.getX() != bottomRight.getX() || topLeft.getY() != bottomRight.getY()) { "A rectangle cannot have zero width or height." }
    }

    fun getTopLeft(): Point = topLeft

    fun getBottomRight(): Point = bottomRight

    // Area Formula: a = w * l
    fun getArea(): Double = (bottomRight.getX() - topLeft.getX()) * (bottomRight.getY() - topLeft.getY())

    fun move(deltaX: Double, deltaY: Double) {
        topLeft.move(deltaX, deltaY)
        bottomRight.move(deltaX, deltaY)
    }
}
