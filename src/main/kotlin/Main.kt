package org.example
import libs.shapeslibrary.*

fun main(){
    val line = Line(Point(32.0,10.0), Point(32.0,10.0))
    println("X point of the start line ${line.getStartPoint().pointXValue} Y point of the start line ${line.getStartPoint().pointYValue}")
    println("X point of the end line ${line.getEndPoint().pointXValue} Y point of the end line ${line.getEndPoint().pointYValue}")
    println("Slope of the line: ${line.getSlope()}")
    println("Length of the line: ${line.getLength()}")
    line.moveStartPoint(Point(5.0,2.0))
    line.moveEndPoint(Point(32.0,10.0))
    println("AFTER MOVE:")
    println("X point of the start line ${line.getStartPoint().pointXValue} Y point of the start line ${line.getStartPoint().pointYValue}")
    println("X point of the end line ${line.getEndPoint().pointXValue} Y point of the end line ${line.getEndPoint().pointYValue}")
    println("Slope of the line: ${line.getSlope()}")
    println("Length of the line: ${line.getLength()}")
}