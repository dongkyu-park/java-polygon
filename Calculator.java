import java.util.ArrayList;

public class Calculator {
    public double distancePointToPoint(Point pointA, Point pointB) {
        // 제곱근((A.x - B.x)^제곱 + (A.y - B.y)^제곱)
        double startX_vertex = pointA.getPointX();
        double endX_vertex = pointB.getPointX();
        double startY_vertex = pointA.getPointY();
        double endY_vertex = pointB.getPointY();

        double distance = Math.sqrt(Math.pow(endX_vertex - startX_vertex, 2) + Math.pow(startY_vertex - endY_vertex, 2));

        return distance;
    }

    public double TriangleArea(ArrayList<Point> pointList) {
        Point pointA = pointList.get(0);
        Point pointB = pointList.get(1);
        Point pointC = pointList.get(2);
        double lineA = distancePointToPoint(pointA, pointB);
        double lineB = distancePointToPoint(pointB, pointC);
        double lineC = distancePointToPoint(pointC, pointA);

        double p = (lineA + lineB + lineC) / 2;

        return Math.sqrt(p * (p - lineA) * (p - lineB) * (p - lineC));
    }
}
