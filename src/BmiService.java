public class BmiService {

    public int calculate(int kg, int height) {
        int index = 0; // индекс массы тела
        kg = 0; //вес в килограммах
        double a = 0;
        double b = 2;
        height =(int) Math.pow (a, b);


        if (index > 0) {
            index = kg / height;
        }
        return index;
    }
}
