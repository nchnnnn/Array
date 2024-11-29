import java.util.Scanner;
import java.util.function.BinaryOperator;

public class Array {


    public static void main(String[] args){

        int[] array1;
        int[] array2;
        int[] array3;

        Scanner input = new Scanner(System.in);
        int times = 0;

        System.out.print("Enter size of the 1st array: ");
        int sizeArray1 = input.nextInt();
        array1 = new int[sizeArray1];

        System.out.print("Enter size of the 2nd array: ");
        int sizeArray2 = input.nextInt();
        array2 = new int[sizeArray2];

        System.out.print("Enter size of the 3rd array: ");
        int sizeArray3 = input.nextInt();
        array3 = new int[sizeArray3];

        System.out.print("\nEnter value of the 1st array: " );

        while(times < array1.length){
            int valueArray1 = input.nextInt();
            array1[times] = valueArray1;
            times++;
        }
        times = 0;

        System.out.print("Enter value of the 2nd array: " );

        while(times < array2.length){
            int valueArray2 = input.nextInt();
            array2[times] = valueArray2;
            times++;
        }
        times = 0;

        System.out.print("Enter value of the 3rd array: " );
        while(times < array3.length){
            int valueArray3 = input.nextInt();
            array3[times] = valueArray3;
            times++;
        }

        System.out.println("\nValue of arrays: ");
        System.out.print("Array 1: " );
        valueArrays(array1);
        System.out.print("Array 2: " );
        valueArrays(array2);
        System.out.print("Array 3: " );
        valueArrays(array3);

        System.out.print("\nCommon Elements is sorted arrays: ");
        commonElements(array1, array2, array3);
    }

    static void valueArrays(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    static void commonElements(int[] array1, int[] array2, int[] array3) {
        for (int i = 0; i < array1.length; i++) {
            if ((existsInArray(array1[i], array2) || existsInArray(array1[i], array3))) {
                System.out.print(array1[i] + " ");
            }
        }

        for (int i = 0; i < array2.length; i++) {
            if (existsInArray(array2[i], array3) && !existsInArray(array2[i], array1)) {
                System.out.print(array2[i] + " ");
            }
        }

        System.out.println();
    }

    static boolean existsInArray(int value, int[] array) {
        for (int j : array) {
            if (j == value) {
                return true;
            }
        }
        return false;
    }
}
