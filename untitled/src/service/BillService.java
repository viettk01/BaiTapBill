package service;
import entities.Bill;
import entities.Customer;
import utils.Utils;
import java.util.Scanner;

public class BillService {
    int n = 0;
    Bill[] bills = new Bill[0];
    Utils utils = new Utils();

    public void Info(Scanner scanner){
        System.out.print("Nhập số hộ sử dụng điện: ");
        n = utils.inputInt(scanner);
        bills = new Bill[n];
        for (int i = 0; i < n; i++) {
            System.out.println("\nHộ sử dụng điện thứ " + (i + 1) + ":");
            bills[i] = inputFamily(scanner);
        } bill();
    }

    public Bill inputFamily(Scanner scanner){
        System.out.print("Họ tên: ");
        String name = scanner.nextLine();
        System.out.print("Số nhà: ");
        String houseId = scanner.nextLine();
        System.out.print("Mã công tơ: ");
        String idElectric = scanner.nextLine();
        System.out.print("Chỉ số cũ: ");
        int oldNumberElectric = utils.inputInt(scanner);
        System.out.print("Chỉ số mới: ");
        int newNumberElectric = utils.inputInt(scanner);
        Customer customer = new Customer(name, houseId, idElectric);
        return new Bill(customer, oldNumberElectric,newNumberElectric);
    }

    public void bill(){
        System.out.println("\nThông tin các biên lai đã nhập:");
        for (int i = 0; i < n; i++) {
            System.out.println("Biên lai " + (i + 1) + ":");
            System.out.println(bills[i].toString());
        }
    }

}
