package webinar03;

public class ArithmeticOperator {
    public static void main(String[] args) {
//        int a = 1;
//        int b = 4;

        int a = 4, b = 4, j = 0, h = 10;

        // +
        int c = a + b;
        System.out.println("Suma: " + c);

        // -
        c = b - a;
        System.out.println("Różnica: " + c);

        // ++
        // j = j + 1
        j++;
        System.out.println("Postinkrementacja: " + j);

        j = 0;
        ++j;
        System.out.println("Preinkrementacja: " +j);

        // --
        // h = h - 1
        h --;
        System.out.println("Postdekrementacja: " + h);

        h = 10;
        --h;
        System.out.println("Predekrementacja: " + h);

        // *
        int r = a * b;
        System.out.println("Iloczyn: " + r);

        // /
        int y = a / b;
        System.out.println("Iloraz: " + y);

        // %
        int u = 5 % 3;
        System.out.println("Modulo: " + u);


    }
}
