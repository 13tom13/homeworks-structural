public class Main {
    public static void main(String[] args) {
        Ints calc = new IntsCalculator();
        System.out.println("Сумма чисел 5 и 3: ");
        System.out.println(calc.sum(5, 3));
        System.out.println();
        System.out.println("Произведение чисел 4 и 7: ");
        System.out.println(calc.mult(4, 7));
        System.out.println();
        System.out.println("Возведение числа 2 в степень 3: ");
        System.out.println(calc.pow(2, 3));

    }
}
