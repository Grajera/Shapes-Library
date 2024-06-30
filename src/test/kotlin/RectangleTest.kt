import shapeLibrary.Point
import shapeLibrary.Rectangle
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

class RectangleTest {
    @Test
    fun testGetArea() {
        val rectangle = Rectangle(Point(0.0, 0.0), Point(4.0, 3.0))
        assertEquals(12.0, rectangle.getArea())
    }

    @Test
    fun testZeroWidthOrHeightRectangle() {
        assertFailsWith<IllegalArgumentException> {
            Rectangle(Point(1.0, 1.0), Point(1.0, 3.0))
        }
        assertFailsWith<IllegalArgumentException> {
            Rectangle(Point(1.0, 1.0), Point(3.0, 1.0))
        }
    }

    @Test
    fun testMoveRectangle() {
        val rectangle = Rectangle(Point(0.0, 0.0), Point(4.0, 3.0))
        rectangle.move(1.0, 1.0)
        assertEquals(1.0, rectangle.getTopLeftPoint().getX())
        assertEquals(1.0, rectangle.getTopLeftPoint().getY())
        assertEquals(5.0, rectangle.getBottomRightPoint().getX())
        assertEquals(4.0, rectangle.getBottomRightPoint().getY())
    }
}
