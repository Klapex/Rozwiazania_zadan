package pl.samouczek.zbior_zadan;

public class ArrayFactory {
    int array_size;

    public ArrayFactory(int array_size) {
        this.array_size = array_size;
    }

    public int[] oneDimension() {
        return new int[array_size];
    }

    public int[][] twoDimension() {
        return new int[array_size][array_size];
    }

    public int[][] unitMatrix(int array_double[][]) {
// najpierw wypelnic zerami.
        for (int a = 0; a < array_double.length; a++) {
            for (int b = 0; b < array_double.length; b++) {
                array_double[a][b] = 0;
            }
        }

// a pozniej jedynkami po przekatnej
        for (int i = 0; i < array_double.length; i++) {
            array_double[i][i] = 1;
        }
        return array_double;
    }
}


