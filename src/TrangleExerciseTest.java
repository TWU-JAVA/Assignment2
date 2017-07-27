import java.util.Scanner;

public class TrangleExerciseTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TrangleExercise trangleExercise = new TrangleExercise();
        int asteriskNumber;
        System.out.println("here is a asterisk:");
        trangleExercise.printOneAsterrisk();
        System.out.println("next we will draw a horizontal line, please input a number that is bigger than 1:");
        asteriskNumber = sc.nextInt();
        trangleExercise.drawHorizontalLine(asteriskNumber);
        System.out.println("next we will draw a vertical line, please input a number that is bigger than 1:");
        asteriskNumber = sc.nextInt();
        trangleExercise.drawVerticalLine(asteriskNumber);
        System.out.println("at last, we will fraw a right triangle, please input a number that is bigger than 1");
        asteriskNumber = sc.nextInt();
        trangleExercise.drawRightTriangle(asteriskNumber);
    }
}
