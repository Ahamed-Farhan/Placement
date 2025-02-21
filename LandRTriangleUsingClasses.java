import java.util.*;
class LeftAngleTriangle{
    public void disp(int n){
        for (int i=0;i<n ;i++ ){
            for (int j=0;j<=i ;j++ ){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }
}
class RightAngleTriangle{
    public void dispo(int n){
        for (int i=0;i<n ;i++ ){
            for (int j=0;j<n-1-i ;j++ ){
                System.out.print(" ");
            }
            for (int j=0;j<=i ;j++ ){
                System.out.print("*");
            } 
            System.out.println();
        }
        System.out.println();
    }
}
public class LandRTriangleUsingClasses
{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n=scn.nextInt();
		LeftAngleTriangle l = new LeftAngleTriangle();
		RightAngleTriangle r = new RightAngleTriangle();
		l.disp(n);
		r.dispo(n);
	}
}
