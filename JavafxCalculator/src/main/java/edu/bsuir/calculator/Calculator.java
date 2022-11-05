package edu.bsuir.calculator;

public class Calculator {

    private int result = 0;


    public void setResult(int result){
        this.result = result;
    }


    public int getResult() {
        return this.result;
    }


    protected int addition(int firstnumber, int secondnumber){
        setResult(firstnumber+secondnumber);
        return this.result;
    }

    protected int substraction (int firstnumber, int secondnumber){
        setResult(firstnumber-secondnumber);
        return this.result;
    }

    protected int multiplication (int firstnumber, int secondnumber){
        setResult(firstnumber*secondnumber);
        return this.result;
    }

    protected int sqrt (int number){
        this.result = (int) Math.sqrt(number);
        return this.result;
    }

    protected int division (int firstnumber, int secondnumber){

        try{
           setResult(firstnumber / secondnumber);
        }

        catch (ArithmeticException e){
            return 0;
        }

       return this.result;

    }

}
