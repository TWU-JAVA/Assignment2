import java.util.Scanner;

public class PrimeFactorsExerciseTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        PrimeFactorsExercise primeFactorsExercise = new PrimeFactorsExercise();
        System.out.print("please input one Integer, and you will see its prime factors: ");
        num = sc.nextInt();
        System.out.println(primeFactorsExercise.generate(num));
    }
}
