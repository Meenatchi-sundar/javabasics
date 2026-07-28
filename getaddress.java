import java.lang.System;
import java.util.Scanner;
class getaddress{
    public static void main(String args[]){
    Scanner john = new Scanner(System.in);
    String name = john.nextLine();
    int age = john.nextInt();
    john.nextLine();
    String address = john.nextLine();
    System.out.println("MY Name is:" + name);
    System.out.println("AGE:" + age);
    System.out.println("ADDRESS:" + address);

    }   
}
