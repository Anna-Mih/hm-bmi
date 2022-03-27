public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double mass = 55;
        double height = 175;
        double bmi = service.calculate(mass, height);
        System.out.println(bmi);
    }
}
