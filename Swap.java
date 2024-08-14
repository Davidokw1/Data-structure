public class Swap {
    public static void main(String[] args) {
        int number = 80;
        int anotherNumber = 49;

        int swap = number;
        number = anotherNumber;
        anotherNumber = swap;

        System.out.println(number);
        System.out.println(anotherNumber);
    }
}
