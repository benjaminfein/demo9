public class Main {
    public static void main(String[] args) {
        String[][] newIntArray = {{"1", "2", "3", "4"}, {"5", "6", "7", "8"},
                {"9", "10", "11", "12"}, {"13", "14", "15", "16"}};
        try {
            ArrayValueCalculator.doCalc(newIntArray);
        } catch (ArraySizeException | ArrayDataException e) {
            e.printStackTrace();
        }
    }
}
