package entities;

public class Customer {
    private String name;
    private String houseId;
    private String idElectric;

    public Customer(String name, String soNha, String maCongTo) {
        this.name = name;
        this.houseId = soNha;
        this.idElectric = maCongTo;
    }

    @Override
    public String toString() {
        return "Họ tên: " + name + "\n" +
                "Số nhà: " + houseId + "\n" +
                "Mã công tơ: " + idElectric + "\n";
    }
}
