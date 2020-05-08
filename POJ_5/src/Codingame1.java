/**
 * Codingame Shadows of the Knight - Episode 1 Implementation
 * https://www.codingame.com/ide/puzzle/shadows-of-the-knight-episode-1
 * Author: Wojtek Turek
 */

import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int W = in.nextInt(); // width of the building.
        int H = in.nextInt(); // height of the building.
        int N = in.nextInt(); // maximum number of turns before game over.
        int X0 = in.nextInt(); //starting position of batman X
        int Y0 = in.nextInt(); //starting position of batman Y
        System.err.println("W:"+W + " H:"+ H + " N:"+N + " X0:"+X0 + " Y0:"+Y0);

        int X1 = 0;
        int Y1 = 0;
        int X2 = W - 1;
        int Y2 = H - 1;

        // game loop
        while(true) {
            String bombDir = in.next(); // the direction of the bombs from batman's current location (U, UR, R, DR, D, DL, L or UL)

            if(bombDir.contains("U")) {
                Y2 = Y0 - 1;
            } else if(bombDir.contains("D")) {
                Y1 = Y0 + 1;
            }

            if(bombDir.contains("L")) {
                X2 = X0 - 1;
            } else if(bombDir.contains("R")) {
                X1 = X0 + 1;
            }

            X0 = X1 + (X2 - X1) / 2;
            Y0 = Y1 + (Y2 - Y1) / 2;

            // the location of the next window Batman should jump to.
            System.out.println(X0 + " " + Y0);
        }
    }
}