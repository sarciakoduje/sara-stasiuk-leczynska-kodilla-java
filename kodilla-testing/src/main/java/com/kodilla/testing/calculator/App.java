package calculator;

public class App {public static void main(String args[]) {
    Calculator calculator = new Calculator();
    calculator.someMethod();

    int resultAdd = calculator.add(5,8);
    System.out.println(resultAdd);

    int resultSub = calculator.substract(5,2);
    System.out.println(resultSub);
}
}
