import java.util.Scanner;
public class thuchanh2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("so tien gui hang thang la ");
        double a=sc.nextDouble();
        System.out.print("ti le lai suat ");
        double b=sc.nextDouble();
        System.out.print("thoi han cho vay ");
        double c=sc.nextDouble();
        double t=0;
        t=a*(b/100)/12*c;
        System.out.println("lai suat la "+t);



    }

}
