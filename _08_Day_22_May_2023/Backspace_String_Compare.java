package _08_Day_22_May_2023;

public class Backspace_String_Compare {
    public static void main(String[] args) {
        String s = "xywrrmp", t = "xywrrm#p";
        Backspace_String_Compare1 backspace_String_Compare1 = new Backspace_String_Compare1();
        boolean b = backspace_String_Compare1.backspaceCompare(s, t);
        System.out.println(b);
    }
}

class Backspace_String_Compare1 {
    public boolean backspaceCompare(String s, String t) {
        String first = "";
        String second = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch != '#') {
                first += ch;
            } else {
                if (first.length() < 2) {
                    first = "";
                } else {
                    first = first.substring(0, first.length() - 1);
                }
            }
        }

        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            if (ch != '#') {
                second += ch;
            } else {
                if (second.length() < 2) {
                    second = "";
                } else {
                    second = second.substring(0, second.length() - 1);
                }
            }
        }

        System.out.println(first + "----" + second);
        return first.equals(second);
    }
}