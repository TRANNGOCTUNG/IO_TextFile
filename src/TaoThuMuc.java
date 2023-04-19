import java.io.File;

public class TaoThuMuc {
    public static void main(String[] args) {
        String tenThuMuc = "ThuMucMoi";
        File thuMuc = new File(tenThuMuc);

        // Sử dụng phương thức mkdir() để tạo thư mục mới
        if (thuMuc.mkdir()) {
            System.out.println("Thư mục " + tenThuMuc + " đã được tạo.");
        }
    }
}