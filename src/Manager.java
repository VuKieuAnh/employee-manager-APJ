import java.util.List;

public class Manager {
    private static List<NhanVien> danhsachNhanvien;
    private String name;


    public static List<NhanVien> getDanhsachNhanvien() {
        return danhsachNhanvien;
    }

    public static void setDanhsachNhanvien(List<NhanVien> danhsachNhanvien) {
        Manager.danhsachNhanvien = danhsachNhanvien;
    }

    public Manager(List<NhanVien> danhsachNhanvien) {
        this.danhsachNhanvien = danhsachNhanvien;
    }

    public void addNhanvien(NhanVien nhanVien){
        danhsachNhanvien.add(nhanVien);
    }

    public void hienthi(){
        for (int i = 0; i < danhsachNhanvien.size(); i++) {
            System.out.println(danhsachNhanvien.get(i).getFullName());
        }
    }
}
