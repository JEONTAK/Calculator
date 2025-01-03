package com.calculator2.app;

import com.calculator2.calculator.Calculator;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //Calculator 클래스 생성
        Calculator calculator = new Calculator();
        while (true) {

            //정수 2개 입력 받기
            System.out.println("첫번째 숫자를 입력해 주세요.");
            char char1 = br.readLine().charAt(0);
            if (char1 < '0' || char1 > '9') {
                System.out.println("숫자를 입력해 주세요!");
            }
            int num1 = char1 - '0';
            System.out.println("두번째 숫자를 입력해 주세요.");

            char char2 = br.readLine().charAt(0);
            if (char2 < '0' || char2 > '9') {
                System.out.println("숫자를 입력해 주세요!");
            }
            int num2 = char2 - '0';

            //만약 둘 중 하나라도 음수라면
            if (num1 < 0 || num2 < 0) {
                System.out.println("양의 정수(0 포함)을 입력해 주세요!");
            } else {
                //사칙 연산 기호 받기
                System.out.println("사칙 연산 기호를 입력해 주세요.");
                char operation = br.readLine().charAt(0);
                //만약 사칙 연산 기호가 맞다면
                if (operation == '+' || operation == '-' || operation == '*') {
                    int result = calculator.calculate(num1, num2, operation);
                    System.out.println("num1 " + operation + " num2 = " + result + " 입니다.");
                    calculator.saveResult(result);
                } else if (operation == '/') {
                    //만약 분모가 0이라면
                    if (num2 == 0) {
                        System.out.println("분모는 0이 아니어야 합니다!");
                    } else {
                        int result = calculator.calculate(num1, num2, operation);
                        System.out.println("num1 " + operation + " num2 = " + result + " 입니다.");
                        calculator.saveResult(result);
                    }
                } else {
                    System.out.println("정확한 사칙 연산 기호를 입력해 주세요!");
                }
            }

            //저장한 결과가 있을 경우 삭제 할지 요청
            if (!calculator.getResult().isEmpty()) {
                System.out.println("가장 처음 연산한 결과를 삭제하시겠습니까? YES를 입력하시면 삭제됩니다.");
                System.out.println("가장 처음 연산한 결과는 " + calculator.getResult().get(0) + " 입니다.");
                String getRemoveRequest = br.readLine();
                if (getRemoveRequest.equals("YES")) {
                    calculator.removeFirst();
                    System.out.println("삭제 되었습니다.");
                }
            }

            System.out.println("더 계산하시겠습니까? exit를 입력하면 종료됩니다.");
            //만약 exit값을 입력받았다면
            String getAgain = br.readLine();
            if (getAgain.equals("exit")) {
                break;
            }
        }
    }
}
