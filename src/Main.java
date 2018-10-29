public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int i = 0;
        while (i < arr.length) {
            System.out.println(arr[i]);
            i++;
        }
        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]);
        }
        for (int j = 0, a = 3, g = 5; j < arr.length; j++) {
            System.out.println(arr[j]);

        }
        int j = 0;
        for (System.out.println("This is first statement"); j < arr.length; System.out.println("end")) {
            System.out.println(arr[j]);
            j++;
        }
    }
}
