/*In some design style, a 4x4 matrix pattern is considered looking pretty if it doesn't consist of a 2x2 matrix of the same color. 
Your task is to write the program that outputs "YES" if the 4x4 matrix is looking pretty, otherwise output "NO".

The input contains 4 lines, each line contains 4 symbols, different symbols represent different colors: 
W stands for white color, B is for black color, R is for red, G is for green, and Y is for yellow color.*/

import java.util.Scanner;

public class ColorPattern {
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
        char[][] c = new char[4][4];
        for (int i = 0; i < 4; i++) {
            c[i] = s.next().toCharArray();
        }
        boolean pretty = true;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (c[i][j] == c[i][j + 1] &&
                        c[i][j] == c[i + 1][j] &&
                        c[i][j] == c[i + 1][j + 1]) {
                    pretty = false;
                }
            }
        }
        System.out.println(pretty ? "YES" : "NO");
    }
}
