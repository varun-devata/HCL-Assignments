
import java.util.Scanner;

public class expences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int quantity = sc.nextInt();
        float pricePerItem = sc.nextFloat();
        double totalExpences = quantity * pricePerItem;

        if(totalExpences > 5000) {
        	totalExpences -= totalExpences * 0.1;
        }
        System.out.println(totalExpences);
    }
}
