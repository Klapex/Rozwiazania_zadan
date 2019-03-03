package pl.samouczek.zbior_zadan;

public class MyNumber {
    double number;

    public MyNumber(double number) {
        this.number = number;
    }

    public boolean isEven() {
        double add_number = number;
        return (add_number %= 2) == 0;
    }

    public boolean isOdd() {
        return !isEven();
    }

    public double sqrt() {
        return Math.sqrt(number);
    }

    public MyNumber power(MyNumber anothernumber) {
        return new MyNumber(Math.pow(number, anothernumber.number));
    }

    public MyNumber addition(MyNumber anothernumber) {
        return new MyNumber(number + anothernumber.number);
    }

    public MyNumber substracting(MyNumber anothernumber) {
        return new MyNumber(number - anothernumber.number);
    }


    @Override

    public String toString() {

        return String.valueOf(number);

    }

}
