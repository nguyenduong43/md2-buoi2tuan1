import java.util.Scanner;
public class thuchanh4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int a=-1;
        while (a!=0)
        {
            System.out.println("menu");
            System.out.println("1.hinh vuong");
            System.out.println("2.chu nhat");
            System.out.println("3.hinh tam giac");
            System.out.println("4.thoat");
            System.out.print("lua chon cua ban la ");
            a=sc.nextInt();
            switch (a)
            {
                case 1:
                    System.out.println("***");
                    System.out.println("***");
                    System.out.println("***");
                    break;
                case 2:
                    System.out.println("*****");
                    System.out.println("*****");
                    System.out.println("*****");
                    break;
                case 3:
                    System.out.println("*");
                    System.out.println("**");
                    System.out.println("***");
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
