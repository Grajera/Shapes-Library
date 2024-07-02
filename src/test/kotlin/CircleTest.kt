import shapeLibrary.Circle
import shapeLibrary.Point
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

class CircleTest {
    @Test
    fun testGetArea() {
        val circle = Circle(Point(0.0, 0.0), 3.0)
        assertEquals(28.274333882308138, circle.getArea())
    }

    @Test
    fun testZeroRadiusCircle() {
        assertFailsWith<IllegalArgumentException> {
            Circle(Point(1.0, 1.0), 0.0)
        }
    }

    @Test
    fun testMoveCircle() {
        val circle = Circle(Point(0.0, 0.0), 3.0)
        circle.move(1.0, 1.0)
        assertEquals(1.0, circle.getCenter().getX())
        assertEquals(1.0, circle.getCenter().getY())
    }
}
