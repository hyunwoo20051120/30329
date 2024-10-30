import java.util.Scanner;

public class Calculator {

    public double add(double num1, double num2) {
        return num1 + num2;
    }
    public double subtract(double num1, double num2) {
        return num1 - num2;
    }
    public double multiply(double num1, double num2) {
        return num1 * num2;
    }
    public double divide(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("0으로 나눌 수 없습니다.");
            return 0;
        }
        return num1 / num2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.print("첫 번째 숫자를 입력하세요:");
        double num1 = scanner.nextDouble();

        System.out.print("두 번째 숫자를 입력하세요:");
        double num2 = scanner.nextDouble();

        System.out.println("연산을 선택하세요: 1 - 덧셈, 2 - 뺄셈, 3 - 곱셈, 4 - 나눗셈");
        int operation = scanner.nextInt();

        double result;
        switch (operation) {
            case 1:
                result = calculator.add(num1, num2);
                System.out.println("결과: " + result);
                break;
            case 2:
                result = calculator.subtract(num1, num2);
                System.out.println("결과: " + result);
                break;
            case 3:
                result = calculator.multiply(num1, num2);
                System.out.println("결과: " + result);
                break;
            case 4:
                result = calculator.divide(num1, num2);
                System.out.println("결과: " + result);
                break;
            default:
                System.out.println("잘못된 연산을 선택했습니다.");
        }
    }
}