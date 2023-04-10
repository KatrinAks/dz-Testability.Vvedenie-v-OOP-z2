public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int mass = service.calculate(56, 1.65);

        System.out.println("Индекс массы тела" + mass);
    }
}