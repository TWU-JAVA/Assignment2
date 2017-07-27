import java.util.Map;

public class DiamondExercise {

    public void drawOneLine(int blankNum, int asteriskNum) {
        String blank = "";
        String asterisk = "";
        for (int i = 0; i < blankNum; i++) {
            System.out.print(" ");
        }
        for (int j = 0; j < asteriskNum; j++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public void drawBottomTriangle(int n) {
        for (int i = n - 1; i > 0; i--) {
            drawOneLine(n - i, 2 * i - 1);
        }
    }

    public void drawIsoscelesTriangle(int n) {
        for (int i = 0; i < n; i++) {
            drawOneLine(n - i - 1, 2 * i + 1);
        }
    }

    public void drawDiamond(int n) {
        drawIsoscelesTriangle(n);
        drawBottomTriangle(n);
    }

    public void drawDiamondWithName(int n) {
        for (int i = 0; i < n - 1; i++) {
            drawOneLine(n - i - 1, 2 * i + 1);
        }
        System.out.println("Yoyo");
        drawBottomTriangle(n);
    }
}
