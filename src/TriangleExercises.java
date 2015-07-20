import static java.lang.Math.abs;

/**
 * Created by yaowenjie on 2015/7/20.
 */
public class TriangleExercises {
    public static void main(String[] args) {
//        System.out.println("*");
//        drawAHorizontalLine(10);
//        drawAVerticalLine(8);
//        drawARightTriangle(8);
//        drawAIsoscelesTriangle(5);
        drawADiamond(10);
    }

    private static void drawADiamond(int n) {
        for (int i=1;i<=2*n-1;i++){
            int index = abs(n-i);
            int length = 2*n-1-2*index;
            drawALineWithIndex(index,length);
            System.out.println("");
        }
    }

    private static void drawAIsoscelesTriangle(int n) {
        for (int i=0;i<n;i++){
            drawALineWithIndex(n-i-1,2*i+1);
            System.out.println("");
        }
    }

    private static void drawALineWithIndex(int index, int length) {
        for(int i=0;i<index+length;i++){
            if(i<index) System.out.print(" ");
            else System.out.print("*");
        }
    }

    public static void drawAHorizontalLine(int n){
        for(int i=0;i<n;i++){
            System.out.print("*");
        }
        System.out.print("\n");
    }

    public static void drawAVerticalLine(int n){
        for(int i=0;i<n;i++){
            System.out.println("*");
        }
    }

    public static void drawARightTriangle(int n){
        for(int i=0;i<n;i++){
            drawAHorizontalLine(i+1);
        }
    }
}
