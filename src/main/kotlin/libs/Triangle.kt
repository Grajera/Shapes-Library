package libs

import kotlin.math.abs

class Triangle(private val point1: Point, private val point2: Point, private val point3: Point) {
    init {
        require(getArea() != 0.0) { "A triangle cannot have zero area." }
    }

    fun getPoint1(): Point = point1
    fun getPoint2(): Point = point2
    fun getPoint3(): Point = point3

    // Area of a Triangle: A = (H*B) / 2
    fun getArea(): Double {
        val a = point1.getX() * (point2.getY() - point3.getY())
        val b = point2.getX() * (point3.getY() - point1.getY())
        val c = point3.getX() * (point1.getY() - point2.getY())
        return abs(a + b + c) / 2.0
    }
    fun move(deltaX: Double, deltaY: Double) {
        point1.move(deltaX, deltaY)
        point2.move(deltaX, deltaY)
        point3.move(deltaX, deltaY)
    }
}
