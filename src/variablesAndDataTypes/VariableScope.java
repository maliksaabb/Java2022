package variablesAndDataTypes;

public class VariableScope {

    // Global or Instance
    int x;

    public static void main(String[] args) {

    }

    static void doSomething(int x) {
        // Local
        int y;
    }

    void doSomethingElse() {
        x = 5;
        doSomething(x);
    }

    void doAnotherThing() {
        x = 55;
        System.out.println(x);
    }

    static String getName() {
        return "Sami";
    }

    static void printNameAge(String name, int age) {
        System.out.println("My name is " + name + " and I am " + age + " years old");
    }

}
