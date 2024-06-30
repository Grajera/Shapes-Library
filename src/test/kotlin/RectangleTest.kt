import libs.Point
import libs.Rectangle
import kotlin.test.Test
import kotlin.test.assertEquals

class RectangleTest {
    @Test
    fun testGetArea() {
        val rectangle = Rectangle(Point(0.0, 0.0), Point(4.0, 3.0))
        assertEquals(12.0, rectangle.getArea())
    }
}
