import libs.Ellipse
import libs.Point
import kotlin.test.Test
import kotlin.test.assertEquals

class EllipseTest {
    @Test
    fun testGetArea() {
        val ellipse = Ellipse(Point(0.0, 0.0), 3.0, 2.0)
        assertEquals(Math.PI * 3.0 * 2.0, ellipse.getArea())
    }
}
