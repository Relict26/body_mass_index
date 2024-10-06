public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height = 1.76; // рост
        double weight = 86; // вес
        int bmi = service.calculate(height, weight); // рассчитанный BMI-индекс
        System.out.println("Ваш BMI-индекс: " + bmi);
    }
}