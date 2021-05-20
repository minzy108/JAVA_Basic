public class MultiArray {
    public static void main(String[] args) {
        int[][] multiArray = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };

        // ==

        int[][] mulArray = new int[3][4];
//        for (int i = 0; i < mulArray[0].length; i++) {
//            mulArray[0][i] = 1 + i;
//        }
//        for (int i = 0; i < mulArray[1].length; i++) {
//            mulArray[1][i] = 1 + i;
//        }
//        for (int i = 0; i < mulArray[2].length; i++) {
//            mulArray[2][i] = 1 + i;
//        }

        // ==
        for (int i = 0; i < mulArray.length; i++) {
            for (int j = 0; j < mulArray[i].length; j++) {
                mulArray[i][j] = (i * 4 + 1) + j;
            }
        }
        for (int i = 0; i < mulArray.length; i++) {
            for (int j = 0; j < mulArray[i].length; j++) {
                System.out.print(mulArray[i][j]);
            }
            System.out.println();
        }
    }
}
