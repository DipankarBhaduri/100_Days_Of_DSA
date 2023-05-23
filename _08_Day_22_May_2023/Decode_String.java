package _08_Day_22_May_2023;

public class Decode_String {
    public static void main(String[] args) {
        String s = "3[a]2[bc]";
        Decode_String1 decode_String1 = new Decode_String1();
        String resultantString = decode_String1.decodeString(s);
        System.out.println(resultantString);
    }
}

class Decode_String1 {
    public String decodeString(String s) {
        String resultant = "";
        int number = 0;
        boolean b = false;

        String curr = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '[') {
                b = true;
            } else if (ch >= 'a' && ch <= 'z' && b) {
                curr += ch;
            } else if (ch == ']') {
                for (int j = 0; j < number; j++) {
                    resultant += curr;
                }

                b = false;
                number = 0;
                curr = "";

            } else {
                number = ch - '0';
            }

        }

        return resultant;
    }
}