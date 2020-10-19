package Converter;

public class toF implements Converter{
    @Override
    public double getResult(double C) {
        return 1.8 * C + 32;
    }

    @Override
    public double back(double New) {
        return (New - 32)/1.8;
    }
}
