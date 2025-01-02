package com.calculator1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            //정수 2개 입력 받기
            int num1 = Integer.parseInt(br.readLine());
            int num2 = Integer.parseInt(br.readLine());
            
            //만약 둘 중 하나라도 음수라면
            if (num1 < 0 || num2 < 0) {
                System.out.println("양의 정수(0 포함)을 입력해 주세요!");
            }else{
                //사칙 연산 기호 받기
                char operation = br.readLine().charAt(0);
                //만약 사칙 연산 기호가 맞다면
                if (operation == '+' || operation == '-' || operation == '*' || operation == '*') {
                    switch(operation){
                        case '+':
                            System.out.println(num1 + " + " + num2 + " = " + (num1 + num2) + " 입니다.");
                            break;
                        case '-':
                            System.out.println(num1 + " - " + num2 + " = " + (num1 - num2) + " 입니다.");
                            break;
                        case '*':
                            System.out.println(num1 + " * " + num2 + " = " + (num1 * num2) + " 입니다.");
                            break;
                        case '/':
                            //만약 분모가 0이라면
                            if(num2 == 0) {
                                System.out.println("분모는 0이 아니어야 합니다!");
                            }else{
                                System.out.println(num1 + " / " + num2 + " = " + (num1 / num2) + " 입니다.");
                            }
                            break;
                    }
                }else{
                    System.out.println("정확한 사칙 연산 기호를 입력해 주세요!");
                }
            }

            System.out.println("더 계산하시겠습니까? exit를 입력하면 종료됩니다.");
            //만약 exit값을 입력받았다면
            String getAgain = br.readLine();
            if(getAgain.equals("exit")){
                break;
            }
        }
    }
}