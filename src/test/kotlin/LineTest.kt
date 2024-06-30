import shapeLibrary.Line
import shapeLibrary.Point
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

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

    @Test
    fun testZeroLengthLine() {
        assertFailsWith<IllegalArgumentException> {
            Line(Point(1.0, 1.0), Point(1.0, 1.0))
        }
    }

    @Test
    fun testMoveLine() {
        val line = Line(Point(0.0, 0.0), Point(1.0, 1.0))
        line.moveLine(1.0, 1.0)
        assertEquals(1.0, line.getStartPoint().getX())
        assertEquals(1.0, line.getStartPoint().getY())
        assertEquals(2.0, line.getEndPoint().getX())
        assertEquals(2.0, line.getEndPoint().getY())
    }
}

