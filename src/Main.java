public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int kg = 56;
        double a = 1.65;

        int mass = service.calculate(56, (int)1.65);

        System.out.println("Индекс массы тела" + mass);
    }
}