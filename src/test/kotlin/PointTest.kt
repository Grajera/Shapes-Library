import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotSame
import shapeLibrary.Point

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
        assertNotSame(point, clone) // Ensure the clone is a different object
    }

    @Test
    fun testGetX() {
        val point = Point(5.0, 10.0)
        assertEquals(5.0, point.getX())
    }

    @Test
    fun testGetY() {
        val point = Point(5.0, 10.0)
        assertEquals(10.0, point.getY())
    }
}
