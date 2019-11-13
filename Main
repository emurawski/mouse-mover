import java.awt.*;

public class Main {
    private static final int DELAY = 10000;

    public static void main(String... args) throws Exception {
        Robot robot = new Robot();
        while (true) {
            Point location = MouseInfo.getPointerInfo().getLocation();
            robot.mouseMove((int) location.getX(), (int) location.getY() - 1);
            Thread.sleep(DELAY);
            robot.mouseMove((int) location.getX(), (int) location.getY() + 1);
            Thread.sleep(DELAY);
        }
    }
}
