import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<NhanVien> c07i2 = new ArrayList<>();
        Manager kieuanh = new Manager(c07i2);
        Manager the = new Manager(c07i2);

        NhanVienParttime quan = new NhanVienParttime("C01", "Quan", 21, "246724", "hjfhsjf", 4);
        kieuanh.addNhanvien(quan);
        NhanVienFulltime toan = new NhanVienFulltime("C02", "Toản", 22, "sf87673", "jshfjs", 22.0f, 0.0f, 8787878.0f);
        the.addNhanvien(toan);
        System.out.println(c07i2.toString());
        for (int i = 0; i < c07i2.size() ; i++) {
            System.out.println(c07i2.get(i).getFullName());
        }
    }
}
