import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        InputManager inputManager = new InputManager();
        OutputManager ouputManager = new OutputManager();
        ArrayList<Point> pointList = new ArrayList<>();
        Calculator calculator = new Calculator();

        pointList = inputManager.convertInputToPointList(); // input값 변환 + 출력

        if (pointList.size() == 2) {
            Point pointA = pointList.get(0);
            Point pointB = pointList.get(1);
            return;
        }

        double area = calculator.TriangleArea(pointList);
        ouputManager.printTriangleArea(area); // 출력
    }
}
