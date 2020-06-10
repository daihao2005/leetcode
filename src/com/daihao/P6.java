package com.daihao;

public class P6 {
    public static void main(String[] args) {

        String s = "PAYPALISHIRING";
        int numRows = 4;
        String convert = convert(s, numRows);
        System.out.println(convert);

    }

    public static String convert(String s, int numRows) {

        for (int i = 0; i < numRows; i++) {
            int j = 0;
            while (true) {
                if (j % (numRows - 1) == 0) {
                    int index = (2 * numRows - 2) * j / (numRows - 1) + i;
                    if(index>s.length()-1){
                        break;
                    }
                    System.out.print(s.charAt(index));
                } else {
                  if(  (i+j)%(numRows-1)==0){
                      System.out.print("#");
                  }else{
                      System.out.print(" ");
                  }
                }

                j++;
            }

            System.out.println();
        }
        return null;
    }
}
