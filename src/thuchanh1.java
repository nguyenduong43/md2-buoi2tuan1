import java.util.Scanner;
public class thuchanh1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap so can kiem tra ");
        int a = sc.nextInt();
        int kt=1;
        if (a==1) kt=0;
        else
        for (int i=2;i<=Math.sqrt(a);i++)
            if (a%i==0) kt=0;
        if (kt==0) System.out.println(+a+ " khong phai la so nguyen to");
        else System.out.println(+a+ " la so nguyen to");
    }
}