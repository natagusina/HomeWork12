package class19;

import java.util.concurrent.Callable;

public class A {
    /*
    Write program for multilevel inheritance where class C inherits
    from class B and Class B inherits from Class A.
    Write program to inherit class A that has method printF
    which is static and call or reuse that method into class B


     */
     String name;
     int number;
     String color;

     void a (){
         System.out.println("Preferences from class A");
     }
     static void printF(){
         System.out.println("Printing values A");
     }
}
class B extends A{
    String book;
    String hobby;




    void b(){
        this.printF();

        System.out.println("Preferences from class B");
    }


}
class C extends B{
    int age;
    void c(){
        System.out.println("Preferences from class C");
    }

    public static void main(String[] args) {
        A C=new A();





            }
        }






