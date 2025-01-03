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

    public int calculate(int num1, int num2, char oper){
        switch(oper){
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            default :
                return num1 / num2;

        }
    }

    public void saveResult(int result){
        resultList.add(result);
    }

    public void removeFirst(){
        resultList.remove(0);
    }
}
