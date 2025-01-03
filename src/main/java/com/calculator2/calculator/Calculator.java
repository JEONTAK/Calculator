package com.calculator2.calculator;

import java.util.ArrayList;

public class Calculator {

    private ArrayList<Integer> resultList;

    public Calculator() {
        this.resultList = new ArrayList<>();
    }

    public ArrayList<Integer> getResult() {
        return resultList;
    }

    public void setResult(ArrayList<Integer> result) {
        this.resultList = result;
    }

    public int calculate(int num1, int num2, char operator){
        switch(operator){
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                return num1 / num2;
            default :
                return 0;
        }
    }

    public void saveResult(int result){
        resultList.add(result);
    }

    public void removeFirst(){
        if (resultList.isEmpty()) {
            System.out.println("현재 저장된 연산 결과가 없습니다!");
        }else{
            System.out.println("저장된 연산 결과 " + resultList.get(0) + "이 삭제 되었습니다.");
            resultList.remove(0);
        }
    }
}
