import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator calculator  = new Calculator();

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            double num1 = sc.nextDouble();

            System.out.print("사칙연산 기호를 입력하세요 (+, -, *, /): ");
            String operator = sc.next();

            System.out.print("두 번째 숫자를 입력하세요: ");
            double num2 = sc.nextDouble();

            double res = calculator.calculator(num1, num2, operator);

            System.out.println("결과: " + res);


            System.out.print("계산을 종료하려면 'exit'을 입력하세요 (계속하려면 엔터 키를 누르세요): ");
            String exit = sc.nextLine();
            exit = sc.nextLine();

            if (exit.equalsIgnoreCase("exit")) {
                break;
            }
        }

        sc.close();

    }
}