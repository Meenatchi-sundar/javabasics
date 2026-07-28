
import java.lang.System;
import java.util.Scanner;
class threeinteger{
    public static void main(String args[]){
        Scanner meenax = new Scanner(System.in);
        int a = meenax.nextInt();
        int b = meenax.nextInt();
        int c = meenax.nextInt();
        int d = a*b*c;
        int e = a+b+c;
        System.out.println(d);
        System.out.println(e);
        System.out.println(d/e);

    }
}