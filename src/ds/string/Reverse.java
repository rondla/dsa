package ds.string;

public class Reverse {

    public static void main(String[] args) {

        System.out.println(reverseInParentheses("(rab)"));

    }

    static String reverseInParentheses(String inputString) {

        char[] charString = inputString.toCharArray();
        int from = 0;
        int to = 0;

        for (int i = 0; i < charString.length; i++) {

            if (charString[i] == '(') {
                from = i + 1;
            }

            if (charString[i] == ')') {

                to = i - 1;

            }

            if (from != 0 && to != 0) {

                revers(charString, from, to);
                from = 0;
                to = 0;
            }


        }


        StringBuilder res = new StringBuilder();

        for (char c : charString) {

            if (c != '(' && c != ')') {

                res.append(c);
            }


        }

        return res.toString();


    }

    private static void revers(char[] inputString, int from, int to) {

        while (from < to) {
            char temp = inputString[from];
            inputString[from] = inputString[to];
            inputString[to] = temp;
            from++;
            to--;

        }


    }

}
