package entities;

public class Bill {
    private Customer customer;
    private int oldNumberElectric;
    private int newNumberElectric;

    public Bill(Customer customer, int oldNumberElectric, int newNumberElectric) {
        this.customer = customer;
        this.oldNumberElectric = oldNumberElectric;
        this.newNumberElectric = newNumberElectric;
    }

    public double price() {
        return (newNumberElectric - oldNumberElectric) * 750;
    }

    @Override
    public String toString() {
        return customer.toString() +
                "Chỉ số cũ: " + oldNumberElectric + "\n" +
                "Chỉ số mới: " + newNumberElectric + "\n" +
                "Số tiền phải trả: " + price() + "\n";
    }
}
