/**
 * Created by yaowenjie on 2015/7/20.
 */
public class PrimeFactorsExercise {
    public static void main(String[] args) {
        generate(30);
    }

    private static void generate(int n) {
        if(n==1) System.out.println();
        else {
            for (int i = 2; i < n; i++) {
                if(n%i==0 && isPrime(i)){
                    System.out.print(i+"  ");
                }
            }
        }
    }

    private static boolean isPrime(int n) {
        for(int i=2;i<n;i++){
            if (n%i==0) return false;
        }
        return true;
    }
}
