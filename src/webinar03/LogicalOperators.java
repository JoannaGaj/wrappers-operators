package webinar03;

public class LogicalOperators {
    public static void main(String[] args) {
        int a = 15, b = 20, k = 0;

//        b > a;
//        k < b;

        System.out.println(b > a);
        System.out.println(k > b);

        boolean result = b > a && b > k; // koniunkcja aby była prawda dwie strony muszą być prawdą
        System.out.println(result);

        result = b != a || k > b; // alternatywa
        System.out.println(result);

    }
}
