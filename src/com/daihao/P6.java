package com.daihao;

public class P6 {
    public static void main(String[] args) {

        String s = "A";
        int numRows = 1;
        String convert = convert(s, numRows);
        System.out.println(convert);

    }

    public static String convert(String s, int numRows) {

        if (s == null || "".equals(s)) {
            return s;
        }
        if (numRows <= 1) {
            return s;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            int j = 0;
            while (true) {
                if (j % (numRows - 1) == 0) {
                    int index = (2 * numRows - 2) * j / (numRows - 1) + i;
                    if (index > s.length() - 1) {
                        break;
                    }
                    sb.append(s.charAt(index));
                    System.out.print(s.charAt(index));
                } else if ((i + j) % (numRows - 1) == 0) {
                    int index = ((j / (numRows - 1)) + 1) * (2 * numRows - 2) - i;
                    if (index > s.length() - 1) {
                        break;
                    }
                    sb.append(s.charAt(index));
                    System.out.print(s.charAt(index));
                } else {
                    System.out.print(" ");
                }
                j++;
            }

            System.out.println();
        }
        return sb.toString();
    }
}
