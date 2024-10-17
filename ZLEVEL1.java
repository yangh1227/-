import java.util.Scanner;

public class ZLEVEL1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int num1 = sc.nextInt();

            System.out.print("사칙연산 기호를 입력하세요 (+, -, *, /): ");
            String operator = sc.next();

            System.out.print("두 번째 숫자를 입력하세요: ");
            int num2 = sc.nextInt();

            if (operator.equals("+")) {
                System.out.println("결과: " + (num1 + num2));
            } else if (operator.equals("-")) {
                System.out.println("결과: " + (num1 - num2));
            } else if (operator.equals("*")) {
                System.out.println("결과: " + (num1 * num2));
            } else if (operator.equals("/")) {
                if (num2 == 0) {
                    System.out.println("나눗셈 연산에서 분모(두 번째 정수)에 0이 입력될 수 없습니다.");
                } else {
                    System.out.println("결과: " + (num1 / num2));
                }
            } else {
                System.out.println("올바른 사칙연산 기호를 입력하세요. (+, -, *, /)");
            }

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
