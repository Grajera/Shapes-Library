package libs

class Circle(center: Point, radius: Double) : Ellipse(center, radius, radius) {
    init {
        require(radius > 0) { "Radius must be greater than zero." }
    }
}
