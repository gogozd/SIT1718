import java.io.*;
import java.util.Arrays;

public class ReadCSV {

    public static String[][] csvRead() {
        String csvFile = "src/studenti.csv";
        BufferedReader br;
        String line;
        String cvsSplitBy = ",";

        String result[][] = new String[10][];

        try {
            br = new BufferedReader(new FileReader(csvFile));
            int i = 0;
            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] country = line.split(cvsSplitBy);

                result[i++] = country;

                System.out.println(Arrays.toString(country));
            }

        } catch (IOException e) {
            e.printStackTrace();

        }

        return result;
    }

    public static String[][] gen2DArr() {

        // Ovo je sve isto kao gore samo što ne ispisuje u konzolu, samo dohvati vrijednosti i nastavlja od int count = 0

        String csvFile = "src/studenti.csv";
        BufferedReader br;
        String line;
        String cvsSplitBy = ",";

        String students[][] = new String[10][];

        try {
            br = new BufferedReader(new FileReader(csvFile));
            int i = 0;
            while ((line = br.readLine()) != null) {
                // use comma as separator
                String[] country = line.split(cvsSplitBy);
                students[i++] = country;
            }

        } catch (IOException e) {
            e.printStackTrace();

        }

        int count = 0;

        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                count++;
            }
        }

        String[][] result = new String[count][];

        for (int i = 0; i < count; i++) {
            result[i] = students[i];
        }

        return result;
    }

}