package com.example.calc;
import java.math.*;

public class Calculator {


    public Integer sum (Integer val1, Integer val2) { return val1+val2;
    }

    public Integer substract (Integer val1, Integer val2) {
        return val1-val2;
    }

    public Integer multiply (Integer val1, Integer val2) {
        return val1*val2;
    }

    public Integer divide (Integer val1, Integer val2) {
        return val1/val2;
    }

    //возведение в степень для целых чисел
    public Integer exp (Integer a, Integer b) {
        int i=1;
        int x=a;
        for (i=1;i<b;i++) {x=x*a;}
        return x;
    }

    //извлечение корня квадратного
    public double sqrt (double a) {

        return Math.sqrt(a);
    }

    //округление числе
    public long round (double a) {
      // return Math.round(a);
        return 0;
    }

}
