package Array;

public class Occurrences {
    public static void main(String[] args) {
        int[] array = {5, 2, 3, 5, 7};

        for (int i = 0; i < array.length; i++) {
            int count = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[j] == array[i]) {
                    count++;

                }
                System.out.println("Count of " + array[i] + " is " + count);
            }

        }
    }
}

