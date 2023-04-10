public class BmiService {

    public int calculate(int kg, double meter) {
        double degree = 2;
        int index = (int) (kg / Math.pow (meter, degree));

        return index;}
    }

