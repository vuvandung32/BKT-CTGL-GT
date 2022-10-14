import java.util.Scanner;

public class _202 {
    public static int isHappyNumber(int num) {
        int rem = 0, sum = 0;

        while (num > 0) {
            rem = num % 10;
            sum = sum + (rem * rem);
            num = num / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số hạnh phúc");
        int num = scanner.nextInt();
        int result = num;

        while (result != 1 && result != 4) {
            result = isHappyNumber(result);
        }

        if (result == 1)
            System.out.println(num + " là số hạnh phúc");

        else if (result == 4)
            System.out.println(num + " không phải số hạnh  phúc");
    }


}
