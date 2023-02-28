public class Main {
    public static void main(String[] args) {
        // Task 1

        int a = 10, b = 4;
        String text = String.format("%d : %d = %d. Остача: %d", a, b, a / b, a % b);
        System.out.println(text);

        // Task 2

        int num = 54;
        if (num >= 10 && num <= 99){
            int j = num % 10;
            int k = (num / 10) % 10;
            System.out.println("Сума цифр числа " + num + " рівна " + (j + k));
        } else {
            System.out.println("Число недвохзначне");
        }

        // Task 3

        double degree = 38.6;

        double res = Math.round(degree);
        System.out.println(res);
    }
}