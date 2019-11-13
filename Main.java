import java.awt.*;

public class Main {
    private static final int DELAY = 10000;
    private static int x = 0;

    public static void main(String... args) throws Exception {
        Robot robot = new Robot();
        while (true) {
            Point location = MouseInfo.getPointerInfo().getLocation();
            robot.mouseMove((int) location.getX(), (int) location.getY() + (x++ % 2 == 0 ? 1 : 0));
            Thread.sleep(DELAY);
        }
    }
}
