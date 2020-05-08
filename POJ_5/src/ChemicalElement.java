/**
 * Exercise 6 - Chemical Elements
 * Author: Wojtek Turek
 *
 * alkali: 3; 11; 19; 37; 55; 87;
 * transition: >=21 && <= 30; >=39 && <= 48; >=72 && <= 80; >=103 && <=112;
 * metals: 13; 49; 50; >=81 && <=83;
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ChemicalElement {
    private int atomicNumber;
    private String symbol;
    private String name;
    private ArrayList<ChemicalElement> chemList;

    public ChemicalElement(int atomicNumber, String symbol, String name) {
        this.atomicNumber = atomicNumber;
        this.symbol = symbol;
        this.name = name;
    }

    public int getAtomicNumber() {
        return atomicNumber;
    }

    public String getSymbol() {
        return symbol;
    }

    public String getName() {
        return name;
    }

    public ChemicalElement() throws FileNotFoundException{
        chemList = new ArrayList<>();
        Scanner sc = new Scanner(new File("src/periodic_table.csv"));
        sc.nextLine();
        while (sc.hasNextLine()) {
            String[] line = sc.nextLine().split(",");
            chemList.add(new ChemicalElement(Integer.parseInt(line[0]), line[1], line[2]));
        }
    }

    public String isAlkaliMetal(int atomNum) {
        switch(atomNum) {
            case 3: case 11: case 19: case 37: case 55: case 87:
                return "It is an alkali metal";
            default:
                return "";
        }

    }

    public String isTransitionMetal(int atomNum) {
        if((atomNum >= 21 && atomNum <= 30) || (atomNum >= 39 && atomNum <= 48) ||
                (atomNum >= 72 && atomNum <= 80) || (atomNum >= 103 && atomNum <= 112))
        {
            return "It is a transition metal";
        }
        return "";
    }

    public String isMetal(int atomNum) {
        switch(atomNum) {
            case 13: case 31: case 49: case 50: case 81: case 82: case 83:
                return "It is a metal";
            default:
                return "";
        }
    }

    @Override
    public String toString() {
        return symbol + ": " + name + " with atomic number " + atomicNumber + ". " +
                isMetal(atomicNumber) +
                isAlkaliMetal(atomicNumber) +
                isTransitionMetal(atomicNumber);
    }

    public static void main(String[] args) throws IOException {

        ChemicalElement list = new ChemicalElement();
        for(ChemicalElement i : list.chemList) {
            System.out.println(i);
        }

    }
}