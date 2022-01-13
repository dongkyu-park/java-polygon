import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        InputManager inputManager = new InputManager();
        ArrayList<Point> pointList = new ArrayList<>();
        Calculator calculator = new Calculator();

        pointList = inputManager.convertInputToPointList();
        Point pointA = pointList.get(0);
        Point pointB = pointList.get(1);
        calculator.distancePointToPoint(pointA, pointB);
    }
}
