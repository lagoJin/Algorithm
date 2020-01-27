package code_test;

import java.lang.Integer;

public class Braces2 {

    static String[] braces(String[] values) {

        String[] strings = new String[values.length - 1];
        int length = Integer.parseInt(values[0]);

        for (int i = 1; i <= length; i++) {
            String value = values[i];

            if (value.length() % 2 != 0) {
                strings[i - 1] = "NO";
            } else {
                String one = value.replace("[", "");
                String two = one.replace("]", "");
                String three = two.replace("{", "");
                String four = three.replace("}", "");
                String five = four.replace("(", "");
                String six = five.replace(")", "");

                if (six.length() == 0) {
                    strings[i - 1] = "YES";
                }

            }
        }
        return strings;
    }

    public static void main(String[] args) {
        String[] text = braces(new String[]{"2", "{}[]()", "{[}]}"});
        for (int i = 0; i < text.length; i++) {
            System.out.println(text[i]);
        }
    }

}