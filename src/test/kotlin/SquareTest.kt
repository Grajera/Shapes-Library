import shapeLibrary.Point
import shapeLibrary.Square
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

class SquareTest {
    @Test
    fun testGetArea() {
        val square = Square(Point(0.0, 0.0), 3.0)
        assertEquals(9.0, square.getArea())
    }

    @Test
    fun testInvalidSideLength() {
        assertFailsWith<IllegalArgumentException> {
            Square(Point(1.0, 1.0), 0.0)
        }
    }

    @Test
    fun testMoveSquare() {
        val square = Square(Point(0.0, 0.0), 3.0)
        square.move(1.0, 1.0)
        assertEquals(1.0, square.getTopLeftPoint().getX())
        assertEquals(1.0, square.getTopLeftPoint().getY())
        assertEquals(4.0, square.getBottomRightPoint().getX())
        assertEquals(4.0, square.getBottomRightPoint().getY())
    }
}
