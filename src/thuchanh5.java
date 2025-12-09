import java.util.Scanner;
public class thuchanh5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int a=-1;
        while (a!=0)
        {
            System.out.println("menu");
            System.out.println("1.hinh chu nhat");
            System.out.println("2.hinh vuong 1");
            System.out.println("3.hinh vuong 2");
            System.out.println("4.thoat");
            System.out.print("lua chon cua ban la ");
            a=sc.nextInt();
            switch (a)
            {
                case 1:
                    for (int i=1;i<=3;i++)
                    {
                        for (int j=1;j<=5;j++)
                            System.out.print("*");
                        System.out.println();
                    }
                    break;
                case 2:
                    for (int i=1;i<=5;i++)
                    {
                        for (int j=1;j<=i;j++)
                            System.out.print("*");
                        System.out.println();
                    }
                    break;
                case 3:
                    for (int i=5;i>=1;i--)
                    {
                        for (int j=1;j<=i;j++)
                            System.out.print("*");
                        System.out.println();
                    }
                    break;
                case 4:
                    a=0;
                    break;
                default:
                    System.out.print("vui long nhap lai ");
                    a=sc.nextInt();
                    break;

            }
        }
    }
}
