import service.BillService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BillService billServices = new BillService();
        billServices.Info(scanner);
    }
}
