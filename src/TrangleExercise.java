
public class TrangleExercise {
    public void printOneAsterrisk() {
        System.out.println("*");
    }

    public void drawHorizontalLine(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public void drawVerticalLine(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("*");
        }
    }

    public void drawRightTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            drawHorizontalLine(i);
        }
    }

}
