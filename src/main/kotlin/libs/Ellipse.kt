package libs

open class Ellipse(private val center: Point, private val radiusA: Double, private val radiusB: Double) {
    init {
        require(radiusA > 0 && radiusB > 0) { "An ellipse cannot have zero area." }
    }

    fun getCenter(): Point = center
    fun getRadiusA(): Double = radiusA
    fun getRadiusB(): Double = radiusB
    fun getArea(): Double = Math.PI * radiusA * radiusB
    fun move(deltaX: Double, deltaY: Double) {
        center.move(deltaX, deltaY)
    }
}
