public class Main {
    public static void main(String[] args) {

        BmiService index = new BmiService();

        int weight = 60;
        double height = 1.75;

        System.out.println("Индекс массы тела составляет: " + index.bmi(weight, height));
    }
}