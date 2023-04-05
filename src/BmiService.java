public class BmiService {

    public int calculate(int kg, double meter) {
        int index = 0; // индекс массы тела
        kg = 0; //вес в килограммах
        meter = 0;
        double degree = 2;
        int height =(int) Math.pow (meter, degree);


        if (index > 0) {
            index = kg / height;
        }
        return index;
    }
}
