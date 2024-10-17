import java.util.Scanner;

public class Calculator {

    public  double calculator (double num1, double num2, String operator){

        double result = 0;

            if (operator.equals("+")) {
                result = num1 + num2 ;
            } else if (operator.equals("-")) {
                result = num1 - num2 ;
            } else if (operator.equals("*")) {
                result = num1 * num2 ;
            } else if (operator.equals("/")) {

                if (num2 == 0) {
                    System.out.println("나눗셈 연산에서 분모(두 번째 정수)에 0이 입력될 수 없습니다.");
                } else {
                    result = num1 / num2 ;
                }
            }

            return result;

    }

}



