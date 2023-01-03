package com.matthewgitata.katas.dnastrand;

/**
 * The class {@code DnaStrand} finds the complementary DNA given one side of the DNA.
 * <p><br/>
 * created by @matthewgitata on 03/01/2023
 */
public class DnaStrand {
    /**
     * Finds complementary DNA given one side of the DNA.
     *
     * @param dna one side of the DNA
     * @return the complementary DNA
     */
    public static String makeComplement(String dna) {
        StringBuilder sb = new StringBuilder();
        char[] symbols = dna.toCharArray();
        if (symbols.length == 0) {
            sb.append("Invalid input");
            return sb.toString();
        } else {
            for (char symbol : symbols) {
                switch (symbol) {
                    case 'A' -> sb.append('T');
                    case 'T' -> sb.append('A');
                    case 'C' -> sb.append('G');
                    case 'G' -> sb.append('C');
                }
            }
        }
        return sb.toString();
    }
}