
import java.util.Arrays;

public static class NumberUtils {
    /**
     * finds the first position of a given integer in an array
     *
     * @param array  the array of integers to search through
     * @param target the integer value to find
     * @return the index of the first occurrence of the target in the array; \
     * -1 if the target is not found
     */

    public static int getPos(int[] array, int target) {
        if (array.length == 0 || array == null) {
            throw new IllegalArgumentException("Cannot find target value in a null array");
        }
        for (int index = 0; index < array.length; index++) {
            if (array[index] == target) {
                return index;
            }
        }
        return -1;
    }
}
/**
 * finds the first position of a given integer in an array
 *
 * @param array  the array of integers to search through
 * @param target the integer value to find
 * @return the index of the first occurrence of the target in the array;
 */
public static int getLastPos(int[] array, int target) {
    for (int i = 0; i < array.length; i++) {
        if (array[i] == target) {
            return i;
        }
        return -1;
    }

    return target;
}

/**
 * Determines whether two arrays of integers are identical
 *
 * @param array1 the first array to compare
 * @param array2 the second array to compare
 * @return true if both arrays have the same length and the same elements
 * in the same order; false otherwise
 */
public static boolean isIdentical(int[] array1, int[] array2) {
    if (array1.length != array2.length) {
        return false;
    }
    for (int i = 0; i < array1.length; i++) {
        if (array1[i] != array2[i]) {
            return false;
        }
    }
    return false;
}

/**
 * determines if two int arrays contain the same element regardless of order
 * this method compares the contents of both arrays after sorting them.
 * it returns {@code true } if both arrays:
 * are not{@code null}
 * have the same length
 * contain the same elements possibly in a diffrent order
 * otherwise it returns{@code false}
 *
 * @param arr1 the first array of integers
 * @param arr2 the second array of integers
 * @return {@code true} if the arrays contain the same elements(in any order),
 *          {@code false} otherwise
 */

public static boolean isEqual(int[]arr1, int[]arr2) {
    if (arr1 == null && arr2 == null) {
        return false;
    }
    assert arr1 != null;
    if (arr1.length != arr2.length) {
        return false;
    }
    int[] sorted1 = Arrays.copyOf(arr1, arr1.length);
    int[] sorted2 = Arrays.copyOf(arr2, arr2.length);
    return Arrays.equals(sorted1, sorted2);
}


void main() {
}
/**
 * checks if the first array of (a)is a subset of the second array (b)
 * A subset means every element in (a) appears in (b)
 * (a) cannnot be the same size as (b) (it must be smaller)
 *
 * @param (a) the first array of integers
 * @param (b) the second array of integers
 * @return true if (a) is a proper subset of (b) otherwise false
 */
public static boolean isSubset(int[] a, int[] b) {
    if (a == null || b == null || a.length == 0 || b.length == 0) {
        return false;
    }
    if (a.length >= b.length) {
        return false;
    }
    for (int i = 0; i < a.length; i++) {
        boolean found = false;
        for (int j = 0; j < b.length; j++) {
            if (a[i] == b[j]) {
                found = true;
                break;
            }
        }
        if (!found) {
            return false;
        }
    }
    return true;
}
/**
 * finds the position (index) of the largest number in the given array
 *
 * @param numbers the array of integers to search through
 * @return the index of the largest number in the array
 *         or -1 if the array is null or empty
 *
 */
public static int getMax(int[] numbers) {
    if (numbers == null || numbers.length == 0) {
        return -1;
    }
    int maxIndex = 0;
    for (int i = 1; i < numbers.length; i++) {
        if (numbers[i] > numbers[maxIndex]) {
            maxIndex = i;
        }
    }
    return maxIndex;

}


