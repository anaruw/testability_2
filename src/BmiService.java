public class BmiService {

    public int bmi(int weight, double height) {

        int result;

        if (height > 10){

            height = (int) height;
            result =(int) (weight * Math.pow(100, 2) / Math.pow(height, 2)); // если рост указан в сантиметрах
        } else {

            result = (int) (weight / Math.pow(height, 2));
        }

        return result;
    }
}
