public class BmiService {

    public int calculate(int bodyMassIndex) {
        int index = 0; // индекс массы тела
        int mass = 0; // вес в килограммах
        int height = 0; // рост в метрах
        int x = 2;

        if (mass > 0) {
            index = mass / (height * x);
        }
        return index;
    }
}
