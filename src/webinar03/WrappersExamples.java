package webinar03;

import java.util.ArrayList;

public class WrappersExamples {
    public static void main(String[] args) {
        int a = 1;
        Integer b = 1;

        String c = b.toString();

        b.toString();
        System.out.println(b.doubleValue());

        System.out.println(b.byteValue());
        System.out.println("To jest liczba: " + c);

        String text = "1234";
        Integer number = Integer.parseInt(text);

        System.out.println(Integer.parseInt(text));

        double price = 24.50;
        Double price2 = 24.99;

        System.out.println(price2.intValue());

        boolean isSunny = true;
        Boolean isSunny2 = true;

        ArrayList<Integer> studentList = new ArrayList();
        studentList.add(1);
        studentList.add(200);

        System.out.println(studentList.toString());


    }
}
