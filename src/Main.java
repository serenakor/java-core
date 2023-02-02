import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên: ");
        String name = scanner.nextLine();
        System.out.println("Tên của bạn là" + name);
        System.out.println("Nhập một số bất kỳ: ");
        int b = Integer.parseInt(scanner.nextLine());
        System.out.println("b =" + b);
        if(b % 2 == 0){
            System.out.println("Số chẵn");
        }else {
            System.out.println("Số lẻ");
        }
        System.out.println(b % 2 == 0 ? "Số chẵn" : "Số lẻ");
    }
}