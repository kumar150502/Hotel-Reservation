package javaassignmentday1;

public class StaticVariableMethodsBlocks {
    static int static_var = 20;
    public static void static_method() {
        System.out.println("This is a static method");
    }
    static {
        System.out.println("This is a static block");
    }
    public static void main(String[] args) {
        System.out.println(static_var);
        static_method();

    }
}