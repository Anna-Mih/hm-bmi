public class BmiService {
    public double calculate(double mass, double height) {
        double heightM = height / 100;
        double bmi = mass / (heightM * heightM);
        return bmi;
    }
}
