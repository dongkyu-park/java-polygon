public class PointXY {
    public static final int MAX_XY_VALUE = 24;

    private double x;
    private double y;

    public PointXY(double x, double y) {
        if (!validateXY(x, y)) {
            throw new IllegalArgumentException("정점의 최댓값은 " + MAX_XY_VALUE + "를 초과할 수 없습니다.");
        };

        this.x = x;
        this.y = y;
    }

    private boolean validateXY(double x, double y) {
        if (x > MAX_XY_VALUE || y > MAX_XY_VALUE) {
            return false;
        }
        return true;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
