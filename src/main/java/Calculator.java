public class Calculator {
    public int add(int number1, int number2){
        return number1+number2;
    }

    public int sub(int number1, int number2){
        return number1-number2;
    }

    public int mul(int number1, int number2){
        return number1*number2;
    }

    public int div(int number1, int number2){
        if(number2==0){
            throw new ArithmeticException("divided by zero");
        }else {
            return number1/number2;
        }
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(1,3));
        System.out.println(calculator.sub(5,3));
        System.out.println(calculator.mul(2,3));
        System.out.println(calculator.div(1,0));
    }
}
