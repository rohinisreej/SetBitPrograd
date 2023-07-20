import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int bit = scanner.nextInt();
        int result = 0;
        result=result|(1<<number);
        result=result|(1<<bit);
        System.out.println(result);
    }
}