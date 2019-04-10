public class Sudoku {

    public static void main(String args[]) {
        new Sudoku(new int[][] {
            {3, 0, 6, 5, 0, 8, 4, 0, 0},
            {5, 2, 0, 0, 0, 0, 0, 0, 0},
            {0, 8, 7, 0, 0, 0, 0, 3, 1},
            {0, 0, 3, 0, 1, 0, 0, 8, 0},
            {9, 0, 0, 8, 6, 3, 0, 0, 5},
            {0, 5, 0, 0, 9, 0, 6, 0, 0},
            {1, 3, 0, 0, 0, 0, 2, 5, 0},
            {0, 0, 0, 0, 0, 0, 0, 7, 4},
            {0, 0, 5, 2, 0, 6, 3, 0, 0}
        }).resolver();
    }

    private int sudoku[][];
    private int n = 9;

    public Sudoku(int sudoku[][]) {
        this.sudoku = sudoku;
    }

    public void resolver() {

        if (!retrocederSolucion()) {
            System.out.println("Este sudoku no se puede resolver");
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(sudoku[i][j] + " ");
            }
            System.out.println();
        }
    }

    public boolean sePuedePonerX(int i, int j, int x) {

        // Se usa X en la fila
        for (int jj = 0; jj < n; jj++) {
            if (sudoku[i][jj] == x) {
                return false;
            }
        }

        // Se usa X en la columna
        
        for (int ii = 0; ii < n; ii++) {
            if (sudoku[ii][j] == x) {
                return false;
            }
        }

        // Is 'x' used in sudoku 3x3 box.
        int posicionFilaCaja = i - i % 3;
        int posicionColumnaCaja = j - j % 3;

        for (int ii = 0; ii < 3; ii++) {
            for (int jj = 0; jj < 3; jj++) {
                if (sudoku[posicionFilaCaja + ii][posicionColumnaCaja + jj] == x) {
                    return false;
                }
            }
        }

        // Resuelto.
        return true;
    }

    public boolean retrocederSolucion() {
        int i = 0, j = 0;
        boolean celdaVacia = false;

        for (int ii = 0; ii < n && !celdaVacia; ii++) {
            for (int jj = 0; jj < n && !celdaVacia; jj++) {
                if (sudoku[ii][jj] == 0) {
                    celdaVacia = true;
                    i = ii;
                    j = jj;
                }
            }
        }

        if (!celdaVacia) {
            return true;
        }

        for (int x = 1; x < 10; x++) {

            if (sePuedePonerX(i, j, x)) {
                sudoku[i][j] = x;

                if (retrocederSolucion()) {
                    return true;
                }

                sudoku[i][j] = 0; // Hemo sido engañado.
            }

        }

        return false; // Antoioh vuerve patras
    }
}
