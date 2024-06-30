import libs.Point
import libs.Square
import kotlin.test.Test
import kotlin.test.assertEquals

class SquareTest {
    @Test
    fun testGetArea() {
        val square = Square(Point(2.0, 2.0), 2.0)
        assertEquals(4.0, square.getArea());
    }
}
