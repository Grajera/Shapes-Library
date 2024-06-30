package shapeLibrary

import kotlin.math.pow
import kotlin.math.sqrt

class Line(private val startPoint: Point, private val endPoint: Point) {
    init {
        require(startPoint != endPoint) { "A line cannot have zero length." }
    }

    fun getStartPoint(): Point = startPoint
    fun getEndPoint(): Point = endPoint

    // Slope Formula: m = (y₂ - y₁)/(x₂ - x₁)
    fun getSlope(): Double = (endPoint.getY() - startPoint.getY()) / (endPoint.getX() - startPoint.getX())

    // Distance Formula: d = √[(x₂ - x₁)² + (y₂ - y₁)²]
    fun getLength(): Double = sqrt((endPoint.getX() - startPoint.getX()).pow(2.0) + (endPoint.getY() - startPoint.getY()).pow(
        2.0
    )
    )

    fun moveStartPoint(deltaX: Double, deltaY: Double) {
        startPoint.move(deltaX, deltaY)
    }
    fun moveEndPoint(deltaX: Double, deltaY: Double) {
        endPoint.move(deltaX, deltaY)
    }
    fun moveLine(deltaX: Double, deltaY: Double) {
        moveStartPoint(deltaX, deltaY)
        moveEndPoint(deltaX, deltaY)
    }
}
