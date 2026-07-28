import java.lang.System;
import java.util.Scanner;
class converthuntoten{
    public static void main(String args[]){

    
        Scanner meenax = new Scanner(System.in);
        String name = meenax.nextLine();
        double score = meenax.nextDouble();
        meenax.nextLine();
        String Department = meenax.nextLine();
        double myscore = score*10/100;
        System.out.println("MY NAME:" + name);
        System.out.println("MY SCORE:" + myscore);
        System.out.println("MY DEPARTMENT:" + Department);


    }
}
