package testPackage;

/*
What is a class?
 - A class is a blueprint or representation of a real-world object
 - Any object can be described using its attributes/characteristics, and the methods that object can perform
 */

class TestClass {

    // Global (Instance) Variables - Accessible by all methods of the class
    static int a = 15;
    static int b = 5;
    static int y = 5;
    static int x = 100;

    public static void main(String[] args) {
        methodOne();
        addition(1, 5);

    }

    static void methodOne() {
        // Local Variable - Restricted to just the method that it is declared inside of
        int x = 40;
        System.out.println(a + x);
    }

    static void methodTwo() {
        System.out.println(b + x);
    }

    void methodThree() {
        System.out.println(a);
    }

    void methodFour() {
        System.out.println(b);
    }


//     Single-line comment
    /*
    Multi
    Line
    Comment
     */

    static int addition(int num1, int num2) {
        /**
         * This method will add any 2 whole numbers
         *
         * @param num1 - First number to add
         * @param num2 - Second number to add
         *
         * @return sum - Sum of num1 and num2
         */

        int sum = num1 + num2;

        return sum;
    }
}

