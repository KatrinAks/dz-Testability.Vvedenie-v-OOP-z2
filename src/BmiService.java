public class BmiService {

    public int calculate(int kg, double meter) {
        double degree = 2;
        int height =(int) Math.pow (meter, degree);

        int index = kg / height;

        return index;}
    }

