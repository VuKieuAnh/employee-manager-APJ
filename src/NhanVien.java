public abstract class NhanVien {
    String code;
    String fullName;
    int age;
    String phone;
    String email;

    public abstract Float getLuong();

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public NhanVien(String code, String fullName, int age, String phone, String email) {
        this.code = code;
        this.fullName = fullName;
        this.age = age;
        this.phone = phone;
        this.email = email;
    }
}
