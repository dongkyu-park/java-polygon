import jdk.internal.util.xml.impl.Input;

import java.util.ArrayList;
import java.util.Scanner;

public class InputManager {
    private static final String MESSAGE_CONSOLE = "> ";
    private static final String MESSAGE_LOCATION = "좌표를 입력하세요.";
    private static final String MESSAGE_INPUT_SUCCESS = " 좌표값이 입력 되었습니다.";
    private static final Scanner sc = new Scanner(System.in);

    public ArrayList<Point> convertInputToPointList() {
        printGuideInput();

        try {
            return extractPointInString(divideString(sc.next()));
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
            return convertInputToPointList();
        }
    }

    public void printGuideInput() {
        System.out.println(MESSAGE_CONSOLE + MESSAGE_LOCATION);
    }

    public String[] divideString(String line) {
        String[] coordinateArr = line.split("-");

        if (coordinateArr.length < 2) {
            throw new IllegalArgumentException("좌표값은 '-' 구분으로 최소 2개 이상 입력해야 합니다.");
        }

        return line.split("-");
    }

    public ArrayList<Point> extractPointInString(String[] coordinateArr) {
        ArrayList<Point> pointList = new ArrayList<>();

        for (int i = 0; i < coordinateArr.length; i++) {
            Point point = convertCoordinateToPoint(coordinateArr[i]);
            pointList.add(point);
            printInputSuccess(coordinateArr[i]);
        }
        return pointList;
    }

    public Point convertCoordinateToPoint(String line) {
        String[] pointArr = line.substring(1, line.length() - 1).split(",");
        double x = Double.parseDouble(pointArr[0]);
        double y = Double.parseDouble(pointArr[1]);

        return new Point(x, y);
    }

    public void printInputSuccess(String coordinate) {
        System.out.println(coordinate + MESSAGE_INPUT_SUCCESS);
    }
}
