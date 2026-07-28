import java.lang.System;
import java.util.Scanner;
class getinput{
    public static void main(String args[]){
        Scanner meenax = new Scanner(System.in);
        String name = meenax.nextLine();
        int age = meenax.nextInt();
        System.out.println("Name:"+ name);
        System.out.println("Age:"+ age);
    }
}