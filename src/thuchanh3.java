import java.util.Scanner;
public class thuchanh3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("nhap a=");
        int a=sc.nextInt();
        System.out.print("nhap b=");
        int b=sc.nextInt();
        while(b!=0)
        {
            int x=a%b;
            a=b;
            b=x;
        }
        System.out.println("uoc chung lon nhat la "+a);
    }
}
