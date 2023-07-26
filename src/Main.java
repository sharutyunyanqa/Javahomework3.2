public class Main {
    public static void main(String[] args) {

        BmiService service = new BmiService();
        int weightInKg = 98;
        double heightInMeters = 1.87;
        double myBmi = service.calculate(98, 1.87);
        System.out.println("Масса: " + myBmi);
    }
}