package com.mate.calculator;

public class Calculator {

    public Integer getResult(String operation, Integer a, Integer b) {
        switch (operation) {
            case "sum": return getSum(a, b);
            case "difference": return getDifference(a, b);
            default: throw new
                    UnsupportedOperationException("Operation " + operation + " is not supported");
        }
    }

    private Integer getSum(Integer a, Integer b) {
        Integer sum = a + b;
        return sum;
    }

    private Integer getDifference(Integer a, Integer b) {
        Integer difference = a - b;
        return difference;
    }
}
