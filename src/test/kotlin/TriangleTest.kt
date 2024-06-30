import shapeLibrary.Point
import shapeLibrary.Triangle
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

class TriangleTest {
    @Test
    fun testGetArea() {
        val triangle = Triangle(Point(0.0, 0.0), Point(4.0, 0.0), Point(0.0, 3.0))
        assertEquals(6.0, triangle.getArea())
    }

    @Test
    fun testGetPoints() {
        val triangle = Triangle(Point(0.0, 0.0), Point(4.0, 0.0), Point(6.0, 3.0))
        assertEquals(Point(0.0, 0.0), triangle.getPoint1())
        assertEquals(Point(4.0, 0.0), triangle.getPoint2())
        assertEquals(Point(6.0, 3.0), triangle.getPoint3())
    }

    @Test
    fun testZeroAreaTriangle() {
        assertFailsWith<IllegalArgumentException> {
            Triangle(Point(1.0, 1.0), Point(2.0, 2.0), Point(3.0, 3.0))
        }
    }

    @Test
    fun testMoveTriangle() {
        val triangle = Triangle(Point(0.0, 0.0), Point(4.0, 0.0), Point(0.0, 3.0))
        triangle.move(1.0, 1.0)
        assertEquals(1.0, triangle.getPoint1().getX())
        assertEquals(1.0, triangle.getPoint1().getY())
        assertEquals(5.0, triangle.getPoint2().getX())
        assertEquals(1.0, triangle.getPoint2().getY())
        assertEquals(1.0, triangle.getPoint3().getX())
        assertEquals(4.0, triangle.getPoint3().getY())
    }
}
