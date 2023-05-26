package webinar03;

import java.util.ArrayList;

public class HomeWork {
    public static void main(String[] args) {
        Integer a = 1;

        Double c = 2.5;
        Float d = 3.2f;
        Character e = 'a';
        Character e1 = 97-32;
        Boolean f = true;

        System.out.println(a instanceof Object);

        ArrayList<Integer> list = new ArrayList<>();

        // z wykorzystaniem metod dostępnych w wrapperach wydrukuj
        // - zmienną 'a' jako liczbą zmiennoprzecinkową
        // - zmienną 'e1' jako znak
        // - zmienną 'd' jako liczbę całkowitą

        System.out.println(a.doubleValue());
        System.out.println(e1.charValue());
        System.out.println(d.intValue());

        int i = 1, j = 2, res = 0;

        res = i +j;

//        sprawdź wyniki dla
//                +=
//                -=
//                *=
//                /=
        System.out.println(i += j); // i = i + j = 3
        System.out.println(i -= j); // i = 3 - 2
        System.out.println(i *= j); // i = 1 * 2
        System.out.println(i /= j); // i = 2 / 2


    }
}
