package dev.nvtruong.oop.fundamentals;

public final class MatrixChallenges {
    private MatrixChallenges() {}

    public static int[][] add(int[][] a, int[][] b) {
        validateRectangular(a);
        validateRectangular(b);
        if (a.length != b.length || a[0].length != b[0].length)
            throw new IllegalArgumentException("matrices must have the same shape");
        int[][] result = new int[a.length][a[0].length];
        for (int r = 0; r < a.length; r++)
            for (int c = 0; c < a[r].length; c++)
                result[r][c] = Math.addExact(a[r][c], b[r][c]);
        return result;
    }

    public static int[][] multiplyByScalar(int[][] matrix, int scalar) {
        validateRectangular(matrix);
        int[][] result = new int[matrix.length][matrix[0].length];
        for (int r = 0; r < matrix.length; r++)
            for (int c = 0; c < matrix[r].length; c++)
                result[r][c] = Math.multiplyExact(matrix[r][c], scalar);
        return result;
    }

    public static String format(int[][] matrix) {
        validateRectangular(matrix);
        StringBuilder sb = new StringBuilder();
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                if (c > 0) sb.append(' ');
                sb.append(matrix[r][c]);
            }
            if (r + 1 < matrix.length) sb.append(System.lineSeparator());
        }
        return sb.toString();
    }

    private static void validateRectangular(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0] == null || matrix[0].length == 0)
            throw new IllegalArgumentException("matrix must not be empty");
        int columns = matrix[0].length;
        for (int[] row : matrix)
            if (row == null || row.length != columns)
                throw new IllegalArgumentException("matrix must be rectangular");
    }
}
