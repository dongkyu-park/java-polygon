public class OutputManager {
    private static final String MESSAGE_TWO_POINT_DISTANCE= "두 점 사이의 거리는 ";
    private static final String MESSAGE_TRIANGLE_AREA= "삼각형 넓이는 ";

    public void printDistance(double distance) {
        System.out.println(MESSAGE_TWO_POINT_DISTANCE + distance);
    }

    public void printTriangleArea(double area) {
        System.out.println(MESSAGE_TRIANGLE_AREA + area);
    }
}
