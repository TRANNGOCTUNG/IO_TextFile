package try_catch;

public class TestThrow3 {
    public static void main(String[] args) {
        try {
            M m = new M();
            m.method();
        } catch (Exception e) {
            System.out.println("Ngoại lệ được xử lý: ");
        }
        System.out.println("Lương bình thường...");
    }
}
