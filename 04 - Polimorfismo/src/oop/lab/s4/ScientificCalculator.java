package oop.lab.s4;

public class ScientificCalculator extends Calculator implements AdvancedOperations {
    @Override
    public double root(double a) {
        return Math.sqrt(a);
    }

    @Override
    public String percentage(double a) {
        return (a * 100) + "%";
    }
}
