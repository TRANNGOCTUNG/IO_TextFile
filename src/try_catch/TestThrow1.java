package try_catch;

public class TestThrow1 {
    public static void checkAge(int age) {
        if(age < 18){
            throw new ArithmeticException("Age must be between: " + age + " and");
        } else {
            System.out.println("Age must be between: " + age);
        }
    }

    public static void main(String[] args){
        checkAge(17);
        System.out.println("Must be between");
    }
}
