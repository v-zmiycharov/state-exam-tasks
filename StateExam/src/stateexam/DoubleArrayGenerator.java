package stateexam;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Random;

public class DoubleArrayGenerator {

    public static void GenerateAndPrintArray() {
        double[] A = new double[27];

        ArrayList under1 = new ArrayList();
        ArrayList under2 = new ArrayList();
        ArrayList under3 = new ArrayList();
        ArrayList under4 = new ArrayList();
        ArrayList under5 = new ArrayList();

        double rangeMin = 0;
        double rangeMax = 4.9;
        Random r = new Random();

        DecimalFormatSymbols symbols = new DecimalFormatSymbols();
        symbols.setDecimalSeparator(',');

        NumberFormat df = new DecimalFormat("#.####", symbols);

        for (int i = 0; i < 27; i++) {
            Double currentValue = rangeMin + (rangeMax - rangeMin) * r.nextDouble();
            A[i] = currentValue;
            if (currentValue < 1) {
                under1.add(df.format(currentValue));
            } else if (currentValue < 2) {
                under2.add(df.format(currentValue));
            } else if (currentValue < 3) {
                under3.add(df.format(currentValue));
            } else if (currentValue < 4) {
                under4.add(df.format(currentValue));
            } else if (currentValue < 5) {
                under5.add(df.format(currentValue));
            }
        }

        System.out.println("Под 1   Под 2   Под 3   Под 4   Под 5   ");
        int totalLength = 8;
        for (int i = 0; i < under1.size() || i < under2.size() || i < under3.size() || i < under4.size() || i < under5.size(); i++) {
            String line = "";

            line += getFormattedItem(totalLength, under1, i);
            line += getFormattedItem(totalLength, under2, i);
            line += getFormattedItem(totalLength, under3, i);
            line += getFormattedItem(totalLength, under4, i);
            line += getFormattedItem(totalLength, under5, i);

            System.out.println(line);
        }
    }

    private static String getFormattedItem(int totalLength, ArrayList list, int index) {
        if (list.size() <= index) {
            return formatRight(totalLength, "");
        } else {
            return formatRight(totalLength, list.get(index).toString());
        }
    }

    private static String formatRight(int totalLength, String word) {
        if (word.length() > totalLength) {
            return word.substring(0, totalLength);
        }

        String result = "";
        for (int i = 0; i < totalLength - word.length(); i++) {
            result += " ";
        }
        result += word;

        return result;
    }
}
