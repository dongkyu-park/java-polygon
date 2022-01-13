import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static final int IS_LINE_SEGMENT = 2;
    private static final int IS_TRIANGLE = 3;
    private static final int IS_RECTANGLE = 4;

    public static void main(String[] args) {
        InputManager inputManager = new InputManager();
        OutputManager outputManager = new OutputManager();
        ArrayList<Point> pointList = new ArrayList<>();

        pointList = inputManager.convertInputToPointList(); // input값 변환 + 출력
        getDistanceOrArea(pointList, outputManager); // 정답 출력
    }

    public static void getDistanceOrArea(ArrayList<Point> pointList, OutputManager outputManager) {
        if (pointList.size() == IS_LINE_SEGMENT) {
            LineSegment lineSegment = new LineSegment(pointList);
            outputManager.printDistance(lineSegment.getDistance()); // 출력
            return;
        }

        if (pointList.size() == IS_TRIANGLE) {
            Triangle triangle = new Triangle(pointList);
            outputManager.printTriangleArea(triangle.getArea()); // 출력
            return;
        }

        if (pointList.size() == IS_RECTANGLE) {
            Rectangle rectangle = new Rectangle(pointList); // pointList 생성자 호출
            outputManager.printRectangleArea(rectangle.getArea()); // 출력

            Rectangle rectangleWH = new Rectangle(rectangle.getWidth(), rectangle.getHeight()); // width, height 생성자 호출
            outputManager.printRectangleArea(rectangleWH.getArea()); // 출력
            return;
        }
    }
}
