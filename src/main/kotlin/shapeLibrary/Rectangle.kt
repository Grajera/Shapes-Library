package shapeLibrary

open class Rectangle(private val topLeftPoint: Point, private val bottomRightPoint: Point) {
    init {
        require(topLeftPoint.getX() != bottomRightPoint.getX() && topLeftPoint.getY() != bottomRightPoint.getY()) { "A rectangle cannot have zero width or height." }
    }

    fun getTopLeftPoint(): Point = topLeftPoint

    fun getBottomRightPoint(): Point = bottomRightPoint

    // Area Formula: a = w * l
    fun getArea(): Double = (bottomRightPoint.getX() - topLeftPoint.getX()) * (bottomRightPoint.getY() - topLeftPoint.getY())

    fun move(deltaX: Double, deltaY: Double) {
        topLeftPoint.move(deltaX, deltaY)
        bottomRightPoint.move(deltaX, deltaY)
    }
}
