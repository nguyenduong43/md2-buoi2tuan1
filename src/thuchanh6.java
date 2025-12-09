import java.util.Scanner;
public class thuchanh6 {
    public static void main(String[] args) {
       int x=0;int i=2;
       while(x<20)
       {
           if (ktngto(i)==1) { x++;
               System.out.println(i+" la so ngto");}
           i++;
       }
    }
    public static int ktngto(int a)
    {
        int kt=1;
        if (a==1) return 0;
        else
            for (int i=2;i<=Math.sqrt(a);i++)
                if (a%i==0) kt=0;
        if (kt==0) return 0;
        else return 1;
    }
}