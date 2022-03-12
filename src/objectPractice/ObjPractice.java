package objectPractice;

public class ObjPractice {
    // Constructor - Is implicit to every class, whether you explicitly declare it or not
    // A constructors job is to create or CONSTRUCT objects of that class

    // This is a constructor
    ObjPractice(){

    }

    String name = "Thuwaiba";

    public static void main(String[] args) {
        /*
         When we initialize a variable, the declaration includes:
         1. Data Type
         2. Name of variable
         3. Assignment Operator
         4. Value we would like to assign to the variable
         */

        int age = 20;

        // Romeo is a reference variable
        Cat romeo = new Cat();
        romeo.name = "Romeo";
        romeo.age = 2;
        romeo.hasFur = true;
        romeo.color = "Gray";
        romeo.gender = "Male";

        Cat rex = new Cat();
        rex.name = "Rex";
        rex.gender = "Male";
        rex.color = "Orange";
        rex.hasFur = true;
        rex.age = 5;

//        System.out.println(romeo.name);
//        System.out.println(rex.name);
//
//        romeo.meow();
//        rex.meow();

        System.out.println(romeo);
        System.out.println(rex);
    }
}
