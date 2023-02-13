import java.util.Arrays;

public class Main {
    public static int[] removeDuplicates(int[] arr) {
        return Arrays.stream(arr).distinct().toArray();
    }

    public static void main(String[] args) {
        int[] arr = {6, 3, 1, 4, 4, 4, 4, 5};


        int[] distinct = removeDuplicates(arr);
        System.out.println(Arrays.toString(distinct));
    }
}