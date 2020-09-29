public class NhanVienParttime extends NhanVien {
    private int soGioLamViec;

    @Override
    public Float getLuong() {
        return Float.valueOf(this.soGioLamViec*100000);
    }

    public NhanVienParttime(String code, String fullName, int age, String phone, String email, int soGioLamViec) {
        super(code, fullName, age, phone, email);
        this.soGioLamViec = soGioLamViec;
    }
}
