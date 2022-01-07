/* Created by IntelliJ IDEA.

Author: Prajjwal Pachauri(cypher)
Date: 07-01-2022
Time: 18:12
File: CovidSpread.java */

import java.util.Scanner;

public class CovidSpread {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextShort();
        while (t-- > 0) {
            int population = sc.nextInt();
            int days = sc.nextInt();
            int sum = 1;
            for (int i = 1; i <= days && sum < population; i++) {
                if (i < 11) {
                    sum = sum * 2;
                } else {
                    sum = sum * 3;
                }
            }
            if (sum >= population) {
                sum = population;
            }
            System.out.println(sum);
        }
    }
}