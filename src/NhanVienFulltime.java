public class NhanVienFulltime extends NhanVien {
    private Float sotienthuong;
    private Float sotienphat;
    private Float luongcung;

    @Override
    public Float getLuong() {
        return luongcung + sotienthuong - sotienphat;
    }

    public NhanVienFulltime(String code, String fullName, int age, String phone, String email, Float sotienthuong, Float sotienphat, Float luongcung) {
        super(code, fullName, age, phone, email);
        this.sotienthuong = sotienthuong;
        this.sotienphat = sotienphat;
        this.luongcung = luongcung;
    }
}
