import java.util.ArrayList;

public class LineSegment extends Shape {
    Point pointA;
    Point pointB;

    public LineSegment(ArrayList<Point> pointList) {
        this.pointA = pointList.get(0);
        this.pointB = pointList.get(1);
    }

    @Override
    double getArea() {
        return 0;
    }

    public double getDistance() {
        return super.getDistancePointToPoint(this.pointA, this.pointB);
    }
}
