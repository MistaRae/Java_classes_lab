public class Calculator {

    public int add(int x, int y) {
        int result = x + y;
        return result;
    }

    public int subtract(int x, int y){
        int result = x - y;
        return result;
    }

    public int multiply(int x, int y){
        int result = x * y;
        return result;
    }

    public double divide(double x, double y){
        double result = 0.00;
        if(y != 0.00){
            result = x / y;
            return result;
        }
        return result;
    }
}
