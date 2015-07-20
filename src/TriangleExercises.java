/**
 * Created by zhangyu on 2015/7/20.
 */
public class TriangleExercises {
    public static void main(String[] args) {
//        System.out.println("*");
//        drawAHorizontalLine(10);
//        drawAVerticalLine(8);
        drawARightTriangle(8);
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
            for(int j=0;j<i+1;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
