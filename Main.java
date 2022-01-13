import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        InputManager inputManager = new InputManager();
        OutputManager ouputManager = new OutputManager();
        ArrayList<Point> pointList = new ArrayList<>();

        pointList = inputManager.convertInputToPointList(); // input값 변환 + 출력

        if (pointList.size() == 2) {
            LineSegment lineSegment = new LineSegment(pointList);
            ouputManager.printDistance(lineSegment.getDistance()); // 출력
            return;
        }

        Triangle triangle = new Triangle(pointList);
        ouputManager.printTriangleArea(triangle.getArea()); // 출력
    }
}
