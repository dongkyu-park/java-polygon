import java.util.ArrayList;

public abstract class Shape {

    abstract double getArea();

    double getDistancePointToPoint(Point pointA, Point pointB) {
        // 제곱근((A.x - B.x)^제곱 + (A.y - B.y)^제곱)
        double startX_vertex = pointA.getPointX();
        double endX_vertex = pointB.getPointX();
        double startY_vertex = pointA.getPointY();
        double endY_vertex = pointB.getPointY();

        double distance = Math.sqrt(Math.pow(endX_vertex - startX_vertex, 2) + Math.pow(startY_vertex - endY_vertex, 2));

        return distance;
    }
}
