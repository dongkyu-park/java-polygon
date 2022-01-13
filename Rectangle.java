import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Rectangle extends Shape {
    Point pointA;
    Point pointB;
    Point pointC;
    Point pointD;

    public Rectangle(ArrayList<Point> pointList) {
        HashSet<Double> xSet = new HashSet<>();
        HashSet<Double> ySet = new HashSet<>();

        if (!validateRectangle(pointList, xSet, ySet)) {
            throw new IllegalArgumentException("사각형은 직사각형 혹은 정사각형만 입력할 수 있습니다.");
        };

        this.pointA = pointList.get(0);
        this.pointB = pointList.get(1);
        this.pointC = pointList.get(2);
        this.pointD = pointList.get(3);
        this.width = calWidth(xSet);
        this.height = calHeight(ySet);
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    private double calWidth(HashSet<Double> xSet) {
        double width = 0;

        for (double x : xSet) {
            if (width == 0) {
                width += x;
                continue;
            }
            width = Math.abs(width - x);
        }
        return width;
    }

    private double calHeight(HashSet<Double> ySet) {
        double height = 0;

        for (double y : ySet) {
            if (height == 0) {
                height += y;
                continue;
            }
            height = Math.abs(height - y);
        }
        return height;
    }

    private boolean validateRectangle(ArrayList<Point> pointList, HashSet<Double> xSet, HashSet<Double> ySet) {
        for (int i = 0; i < pointList.size(); i++) {
            xSet.add(pointList.get(i).getPointX());
            ySet.add(pointList.get(i).getPointY());
        }

        if (xSet.size() == 2 && ySet.size() == 2) {
            return true;
        }
        return false;
    }

    @Override
    double getArea() {
        return this.width * this.height;
    }

    double getWidth() {
        return this.width;
    }

    double getHeight() {
        return this.height;
    }
}
