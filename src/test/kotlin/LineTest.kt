import libs.Line
import libs.Point
import kotlin.test.Test
import kotlin.test.assertEquals

class LineTest {
    @Test
    fun testGetSlope() {
        val line = Line(Point(0.0, 0.0), Point(1.0, 1.0))
        assertEquals(1.0, line.getSlope())
    }

    @Test
    fun testGetLength() {
        val line = Line(Point(0.0, 0.0), Point(3.0, 4.0))
        assertEquals(5.0, line.getLength())
    }
}
