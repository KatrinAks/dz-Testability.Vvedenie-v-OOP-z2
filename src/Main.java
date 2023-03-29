public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int mass = 56;
        int height = (int)1.65;

        int index = service.calculate(bodyMassIndex);

        System.out.println(index);
            }
}