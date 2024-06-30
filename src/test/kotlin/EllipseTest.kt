import shapeLibrary.Ellipse
import shapeLibrary.Point
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

class EllipseTest {
    @Test
    fun testGetArea() {
        val ellipse = Ellipse(Point(0.0, 0.0), 3.0, 2.0)
        assertEquals(Math.PI * 3.0 * 2.0, ellipse.getArea())
    }

    @Test
    fun testZeroRadiusEllipse() {
        assertFailsWith<IllegalArgumentException> {
            Ellipse(Point(1.0, 1.0), 0.0, 1.0)
        }
        assertFailsWith<IllegalArgumentException> {
            Ellipse(Point(1.0, 1.0), 1.0, 0.0)
        }
    }

    @Test
    fun testMoveEllipse() {
        val ellipse = Ellipse(Point(0.0, 0.0), 3.0, 2.0)
        ellipse.move(1.0, 1.0)
        assertEquals(1.0, ellipse.getCenter().getX())
        assertEquals(1.0, ellipse.getCenter().getY())
    }
}
