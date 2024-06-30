import libs.Point
import libs.Triangle
import kotlin.test.Test
import kotlin.test.assertEquals

class TriangleTest {
    @Test
    fun testGetArea() {
        val triangle = Triangle(Point(0.0, 0.0), Point(4.0, 0.0), Point(0.0, 3.0))
        assertEquals(6.0, triangle.getArea())
    }
}
