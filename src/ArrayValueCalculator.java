public class ArrayValueCalculator {
    public static void doCalc(String[][] stringArray) throws ArraySizeException, ArrayDataException {
        if (stringArray.length != 4) {
            throw new ArraySizeException("Length by X axis is less than 4");
        } else if (stringArray[0].length !=4||
                stringArray[1].length !=4 ||
                stringArray[2].length !=4 ||
                stringArray[3].length !=4) {
            throw new ArraySizeException("Length by Y axis is less than 4");
        } else {
            int currentElement = 0;
            for (int i = 0; i < stringArray.length; i++) {
                for (int j = 0; j < stringArray[0].length; j++) {
                    try {
                        currentElement = currentElement + Integer.parseInt(stringArray[i][j]);
                    } catch (NumberFormatException e) {
                        throw new ArrayDataException("Wrong symbol in the [" + i + "][" + j + "] cell of your array");
                    }
                }
            }
            System.out.println(currentElement);
        }
    }
}
