import libs.Point
import kotlin.test.Test
import kotlin.test.assertEquals

class PointTest {
    @Test
    fun testMove() {
        val point = Point(0.0, 0.0)
        point.move(1.0, 1.0)
        assertEquals(1.0, point.getX())
        assertEquals(1.0, point.getY())
    }

    @Test
    fun testClone() {
        val point = Point(2.0, 3.0)
        val clone = point.clone()
        assertEquals(point.getX(), clone.getX())
        assertEquals(point.getY(), clone.getY())
    }
}
