package homeWork12;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Mom's first name?");
        String momName= scan.next();
        System.out.println("Dad's firs name?");
        String dadName= scan.next();
        System.out.println("It's boy or girl?");
        String gender=scan.next();
        String babyName="";
        if(gender.equalsIgnoreCase("Boy")){
            babyName=momName.substring(0,2)+dadName.substring(dadName.length()-3);

        }else if(gender.equalsIgnoreCase("girl")){
            babyName=dadName.substring(0,3)+momName.substring(momName.length()-2);
        }
        System.out.println("Suggested baby name is "+babyName);


    }
}
