/**
 * Codingame Pirate's Treasure Implementation
 * https://www.codingame.com/training/easy/pirates-treasure
 * Author: Wojtek Turek
 */


import java.util.*;
import java.io.*;
import java.math.*;


/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int W = in.nextInt();
        int H = in.nextInt();

        System.err.println(W +"x"+ H);

        int[][] array = new int[H][W];

        for (int i = 0; i < H; i++) {

            for (int j = 0; j < W; j++) {
                int v = in.nextInt();
                array[i][j] = v;
            }
        }

        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                if(array[i][j] == 0 && helper(array, i-1, j-1) == 1 && helper(array, i-1, j)== 1 &&
                        helper(array, i-1, j+1)== 1 && helper(array, i, j-1)== 1 && helper(array, i, j+1)== 1 &&
                        helper(array, i+1, j-1)== 1 && helper(array, i+1, j)== 1 && helper(array, i+1, j-1)== 1
                ) {
                    System.out.print(j + " " + i);
                    return;
                }
            }
        }
    }

    public static int helper(int [][]array, int width, int height) {
        if(width == -1 || height == -1 || width >= array.length || height >= array[width].length || width < 0 || height < 0){
            return 1;
        } else {
            return array[width][height];
        }
    }
}