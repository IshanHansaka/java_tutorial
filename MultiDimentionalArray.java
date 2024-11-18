public class MultiDimentionalArray {
    public static void main(String[] args) {
        int arr[][] = new int[3][4];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                arr[i][j] = (int) (Math.random()*100);
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        for (int a[]: arr) {
            for (int m: a) {
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }
}
