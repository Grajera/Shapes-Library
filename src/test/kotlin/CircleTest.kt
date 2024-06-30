import libs.Circle
import libs.Point
import kotlin.test.Test
import kotlin.test.assertEquals

class CircleTest {
    @Test
    fun testGetArea() {
        val circle = Circle(Point(0.0, 0.0), 3.0)
        assertEquals(Math.PI * 3.0 * 3.0, circle.getArea())
    }
}