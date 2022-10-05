class Calculator{
    public void plus(int a, int b){
        System.out.println("a + b is "+(a+b));
    }
    public void minus(int a, int b){
        System.out.println("a - b is "+(a-b));
    }
    public void multiply(int a, int b){
        System.out.println("a * b is "+(a*b));
    }
    public void divide(int a, int b){
        System.out.println("a / b is "+(double)(a/b));
    }
}
public class CalculatorMain {
    public static void main(String[] args) {
        Calculator c = new Calculator ();

        c.divide(2,1);
        c.plus(2,1);
        c.minus(2,1);
        c.multiply(2,1);
    }
}
