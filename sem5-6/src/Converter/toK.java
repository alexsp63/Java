package Converter;

public class toK implements Converter{
    @Override
    public double getResult(double C) {
        return C + 273;
    }

    @Override
    public double back(double New) {
        return New - 273;
    }
}
