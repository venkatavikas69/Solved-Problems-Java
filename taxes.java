/*

In some country, there are N companies, and the law of that country say that the taxes of each company are individual and appointed by a president. President wants to know which company pays the most taxes. But sadly, none of the president's proxies know math very well, so this work is transferred to you. Can you solve this problem?

The first line of the input contains N which is the number of companies in this country.
The second line contains yearly incomes of each company. All numbers are non-negative integers.
The third line contains individual taxes for each company in percents of the company's income. All numbers are integers from 0 to 100 inclusive.

You should output № of the company that pays the most taxes. Keep in mind that the enumeration of the companies starts with number 1. If there are several companies with the same payment sizes, output the number of the company with the lowest number.

Sample Input 1:

1
1
1
Sample Output 1:

1
Sample Input 2:

2
50 100
10 10
Sample Output 2:

2
Sample Input 3:

3
50 100 300
100 20 0
Sample Output 3:

1

*/

import java.util.*;

public class Main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        
        float[] arrayIncome = new float[n];
        float[] arrayPercent = new float[n];
        float[] arrayTaxes = new float[n];
        
        float x = 0;
        int y = 1;
        
        for(int i = 0; i < arrayIncome.length; i++) {
            arrayIncome[i] = scanner.nextFloat();
        }
        
        for(int j = 0; j < arrayPercent.length; j++) {
            arrayPercent[j] = scanner.nextFloat();
            arrayTaxes[j] = arrayIncome[j] * arrayPercent[j] / 100;
            
            if (arrayTaxes[j] > x) {
                x = arrayTaxes[j];
                y = j + 1;
            }
            
        }
        
        System.out.println(y);

    }
}
