package try_catch;

public class TestThrow2 {
    public void  checkAge(int age){
        try {
            if(age < 18){
                throw new ArithmeticException("Age must be between: " + age + " and");
            } else {
                System.out.println("Age must be between: " + age);
            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());

        }
    }

    public static void main(String[] args) {
        TestThrow2 testThrow2 = new TestThrow2();
        testThrow2.checkAge(17);
        System.out.println("Age must be between: ");
    }
}
