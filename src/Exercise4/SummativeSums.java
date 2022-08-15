package Exercise4;

public class SummativeSums {
    public static void main(String[] args) {

        int[] array1 = {1, 90, -33, -55, 67, -16, 28, -55, 15};
        int[] array2 = {999, -60, -77, 14, 160, 301};
        int[] array3 = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130,
                140, 150, 160, 170, 180, 190, 200, -99};

        System.out.println("#1 Array Sum: " + sumArray(array1));
        System.out.println("#2 Array Sum: " + sumArray(array2));
        System.out.println("#3 Array Sum: " + sumArray(array3));

    }

    // static method that adds up all elements in an array and returns the sum
    public static int sumArray (int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++){
            sum+= array[i];
        }
        return sum;
    }
}
