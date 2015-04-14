package vladosiq.viperino;

public class Field {
    private static int[][] arrayField;

    public static void init() {
        arrayField = new int[10][20];
    }
    public static void setSnake() {
        for(int i=5; i<10; ++i) {
            arrayField[4][i]=1;
        }
    }
    public static void setFruit() {
        arrayField[7][7]=2;
    }
    public static int[][] getArrayField() {
        return arrayField;
    }
}
