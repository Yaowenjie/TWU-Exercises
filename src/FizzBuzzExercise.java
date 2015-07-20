/**
 * Created by zhangyu on 2015/7/20.
 */
public class FizzBuzzExercise {
    public static void main(String[] args) {
        FizzBuzz(100);
    }

    private static void FizzBuzz(int n) {
        for(int i=1;i<=n;i++){
            if (i%3 == 0 && i%5 == 0 ) System.out.println("FizzBuzz");
            else if(i%3 == 0) System.out.println("Fizz");
            else if(i%5 == 0) System.out.println("Buzz");
            else System.out.println(i);
        }
    }
}
