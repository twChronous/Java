import java.util.Arrays;

public class Dia2 {
    public static void main(String[] args) {
        int[] my_array1 = {
                1789,2035,1899,1456,2013,1458,2458,1254,1472,2365,1456,2165,1457,2456
        };
        String[] my_array2 = {
                "Java", "Python", "C#", "PHP", "C programming", "C++"
        };
        System.out.println("Array 1 original: " + Arrays.toString(my_array1));
        Arrays.sort(my_array1);
        System.out.println("Array 1 sorted: " + Arrays.toString(my_array1));

        System.out.println("Array 2 original: " + Arrays.toString(my_array2));
        Arrays.sort(my_array2);
        System.out.println("Array 2 sorted: " + Arrays.toString(my_array2));
    }
}