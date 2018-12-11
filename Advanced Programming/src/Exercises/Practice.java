public class Practice {
    public static void main(String[] args) {

        int i = 100;
        while(i >= 0) {
            System.out.print(i + " ");
            i -= 2;
        }
        System.out.println();
        for (int j = 100; j >= 0; j-=2) {
            System.out.print(j + " ");
        }
        System.out.println();
        for (int j = 100; j >= 0; j--) {
            if (j%2 == 0) System.out.print(j + " ");
        }
    }
}
