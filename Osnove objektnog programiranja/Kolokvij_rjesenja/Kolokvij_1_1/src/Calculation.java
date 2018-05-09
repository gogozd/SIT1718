public class Calculation {


    public static void avgSems(String[][] grades) {
        String[][] students = ReadCSV.gen2DArr();

        for (int i = 1; i < students.length; i++) {

            double sum = 0;

            for (int j = 1; j < students[i].length; j++) {
                sum += Double.parseDouble(students[i][j]);
            }

            double result = roundN(sum / (students[i].length - 1), 2);

            System.out.println("Student: " + students[i][0] + " --> AVG: " + result);
        }
    }

    private static double roundN(double value, int places) {
        double scale = Math.pow(10, places);
        return Math.round(value * scale) / scale;
    }

}