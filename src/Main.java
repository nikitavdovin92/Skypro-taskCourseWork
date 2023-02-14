import java.util.Arrays;

public class Main {
    public static int[] removeDuplicates(int[] arr) {
        return Arrays.stream(arr).distinct().toArray();
    }

    public static void main(String[] args) {
        int[] arr = {13526, 14522, 14522, 13526, 1753225, 1824355, 183333, 2543545};


        int[] distinct = removeDuplicates(arr);
        System.out.println(Arrays.toString(distinct));
    }
}