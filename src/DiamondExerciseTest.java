import java.util.Scanner;

public class DiamondExerciseTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DiamondExercise diamondExercise = new DiamondExercise();
        int num;
        System.out.println("draw a Isosceles Triangle, please input a num that is bigger than 1: ");
        num = sc.nextInt();
        diamondExercise.drawIsoscelesTriangle(num);
        System.out.println("draw a Diamond Triangle, please input a num that is bigger than 1: ");
        num = sc.nextInt();
        diamondExercise.drawDiamond(num);
        System.out.println("draw a Diamond Triangle with name, please input a num that is bigger than 1: ");
        num = sc.nextInt();
        diamondExercise.drawDiamondWithName(num);

    }
}
