import java.util.ArrayList;

public class Triangle extends Shape {
    Point pointA;
    Point pointB;
    Point pointC;

    public Triangle(ArrayList<Point> pointList) {
        this.pointA = pointList.get(0);
        this.pointB = pointList.get(1);
        this.pointC = pointList.get(2);
    }

    @Override
    double getArea() {
        double lineA = getDistancePointToPoint(this.pointA, this.pointB);
        double lineB = getDistancePointToPoint(this.pointB, this.pointC);
        double lineC = getDistancePointToPoint(this.pointC, this.pointA);

        double p = (lineA + lineB + lineC) / 2;

        return Math.sqrt(p * (p - lineA) * (p - lineB) * (p - lineC));
    }
}
