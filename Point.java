public class Point {
    PointXY pointXY;

    public Point(double x, double y) {
        this.pointXY = new PointXY(x, y);
    }

    public double getPointX() {
        return pointXY.getX();
    }

    public double getPointY() {
        return pointXY.getY();
    }
}
