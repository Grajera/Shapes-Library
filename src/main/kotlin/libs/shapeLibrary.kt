package libs.shapeslibrary
import kotlin.math.*
/*
    2.3 Rectangle
        You can choose how to represent a rectangle, either with lines or points (I think points is easier, just use 2 points)
        A rectangle cannot have 0 width or height
        A user should be able to get the attributes that define a rectangle (either the points or the lines)
        A user should be able to get the area of the rectangle
        A user should be able to move a rectangle.
    2.4 Square
        All of the same requirements for Rectangle only width and height must be identical
    2.5 Ellipse
        An ellipse should be represented by a point and 2 radii.
        An ellipse cannot have an area of 0
        A user should be able to get the attributes that define the ellipse
        A user should be able to get the area of an ellipse
        A user should be able to move an ellipse
    2.6 Circle
        All of the same requirement for ellipse only the 2 radii are the same.
    2.7 Triangle
        A triangle can either be made up of lines or points (again, points are easier I think)
        A triangle must not have an area of 0 (this occurs when all 3 points are on the same line)
        A user should be able to get the attributes the define the triangle
        A user should be able to get the area of the triangle
        A user should be able to move a triangle

 */

/*
2.1 Point
    A point should have x and y attributes, these should be Doubles.
    A user should be able to the get the x and y attributes
    A user should be able to clone a point (get a new point with the same attributes).
    A user should be able to move a point by a delta in each axis.
*/

class Point(
    var pointXValue: Double,
    var pointYValue: Double
) {
    fun clonePoint(): Point
    {
        return Point(pointXValue, pointYValue)
    }
    fun movePoint(deltaChangeForX: Double, deltaChangeForY: Double)
    {
        pointYValue += deltaChangeForY
        pointXValue += deltaChangeForX
    }
}
/*
2.2 Line
    A line consists of 2 points and cannot have 0 length
    A user should be able to get the points that define the line (you might consider strongly encapsulating the points)
    A user should be able the get the slope of the line
    A user should be able to get the length of the line
    A user should be able to move a line
*/

//m = (y2 - y1)/(x2 - x1)
class Line(
    private var startPoint: Point,
    private var endPoint: Point
)
{
    init{
        require(startPoint.pointXValue != endPoint.pointXValue || startPoint.pointYValue != endPoint.pointYValue)
        {
            "A line cannot have zero length."
        }
    }
    fun getStartPoint(): Point
    {
        return startPoint
    }
    fun getEndPoint(): Point
    {
        return endPoint
    }

    // Slope Formula: m = (y₂ - y₁)/(x₂ - x₁)
    fun getSlope(): Double {
        return (endPoint.pointYValue - startPoint.pointYValue) / (endPoint.pointXValue - startPoint.pointXValue)
    }

    // Distance Formula: d = √[(x₂ - x₁)² + (y₂ - y₁)²]
    fun getLength(): Double {
        return sqrt((endPoint.pointXValue - startPoint.pointXValue).pow(2) + (endPoint.pointYValue - startPoint.pointYValue).pow(2))
    }

    fun moveStartPoint(movePoint: Point)
    {
        startPoint = movePoint
    }
    fun moveEndPoint(movePoint: Point)
    {
        endPoint = movePoint
    }
}
/*
2.3 Rectangle
    You can choose how to represent a rectangle, either with lines or points (I think points is easier, just use 2 points)
    A rectangle cannot have 0 width or height
    A user should be able to get the attributes that define a rectangle (either the points or the lines)
    A user should be able to get the area of the rectangle
    A user should be able to move a rectangle.
 */
