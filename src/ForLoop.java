public class ForLoop {
    public static void main(String[] args) {
        int[][] data = {
                {1,2,3},
                {4,5,6},
                {7,8,9},
                {10,11,12},
                {1,2,3},
                {4,5,6},
                {7,8,9},
                {10,11,12},
        };

        System.out.println(" --- Option 1 - Started ---");
        FIRST: for (int i = 0; i < data.length; i++) {
            SECOND: for (int j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(" --- Option 1 - Finished ---");

        System.out.println(" --- Option 2 - Started ---");
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                // skips the arrays containing 4
                if (data[i][j] == 4) {
                    break;
                }
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(" --- Option 2 - Finished ---");

        System.out.println(" --- Option 3 - Started ---");
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                // skips the identified value(s)
                if (data[i][j] == 4 || data[i][j] == 11) {
                    continue;
                }
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(" --- Option 3 - Finished ---");

        System.out.println(" --- Option 4 - Started ---");
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                // drops out of the application when the first
                // instance of the identified value is found
                if (data[i][j] == 4) {
                    return;
                }
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(" --- Option 4 - Finished ---");

    }
}