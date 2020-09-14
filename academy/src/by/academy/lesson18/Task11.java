package by.academy.lesson18;
/*
 * https://www.hackerrank.com/challenges/java-arraylist/problem
 */

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Task11 {

	public static void main(String[] args) throws IOException {

		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<ArrayList<Integer>> rows = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            int d = in.nextInt();
            ArrayList<Integer> row = new ArrayList<>();
            
            for (int j = 0; j < d; j++) {
                row.add(in.nextInt());
            }
            
            rows.add(row);
        }
        
        int q = in.nextInt();
        
        for (int i = 0; i < q; i++) {
            int x = in.nextInt();
            int y = in.nextInt();
            
            try {
                System.out.println(rows.get(x - 1).get(y - 1));
            } catch (IndexOutOfBoundsException e) {
                System.out.println("ERROR!");
            }
        }
    }
}