public class Main {
    public static void main(String[] args) {
        BinOps binOps = new BinOps();
        System.out.println("Сумма бинарных чисел 0111 и 0010: ");
        System.out.println(binOps.sum("0111", "0010"));
        System.out.println("Произведение бинарных чисел 0011 и 0101: ");
        System.out.println(binOps.mult("0011", "0101"));
    }
}
