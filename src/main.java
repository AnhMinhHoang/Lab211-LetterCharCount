
import java.util.Scanner;
import model.Data;
import controller.Programming;

public class main {
    public static void main(String[] args) {
        Data data = new Data();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string: ");
        data.setString(sc.nextLine());
        new Programming(data).run();
    }
}
