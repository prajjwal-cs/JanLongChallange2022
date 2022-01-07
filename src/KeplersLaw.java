/* Created by IntelliJ IDEA.

Author: Prajjwal Pachauri(cypher)
Date: 07-01-2022
Time: 17:43
File: KeplersLaw.java */

import java.util.Scanner;

public class KeplersLaw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            float t1 = sc.nextFloat();
            float t2 = sc.nextFloat();
            float r1 = sc.nextFloat();
            float r2 = sc.nextFloat();

            float ratio1 = (t1 * t1) / (r1 * r1 * r1);

            float ratio2 = (t2 * t2) / (r2 * r2 * r2);

            if (ratio1 == ratio2) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}