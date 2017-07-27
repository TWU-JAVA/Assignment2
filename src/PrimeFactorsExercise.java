import java.util.ArrayList;

public class PrimeFactorsExercise {

    public ArrayList<Integer> generate(int n) {
        ArrayList<Integer> factors = new ArrayList<Integer>();

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                while (n % i == 0) {
                    factors.add(i);
                    n = n / i;
                }
            }
        }
        if (n > 1) {
            factors.add(n);
        }

        return factors;
    }

}
