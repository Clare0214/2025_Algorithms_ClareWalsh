import ui.NumberUtils;

public class Statistics {
    public static void main(String[] args) {
        int[] numbers = {5, 12, 8, 12, 7};
        int target = 12;

        int position = NumberUtils.getPos(numbers, target);
        if (position != -1) {
            System.out.println("the first occurence of" + target + "is at index:" + position);

        } else {
            System.out.println(target + "not found in the array");

        }
    }
}

void main(String[] args) {
    int [] numbers ={5,12,8,12,7};
    int target = 12;

    int firstPos= NumberUtils.getPos(numbers,target);
    int lastPos = NumberUtils.getLastPos(numbers,target);

    System.out.println("fist occurance of"+ target +":"+ firstPos);
    System.out.println("last occurance of"+ target +":"+ lastPos);

}

void main() {
    int [] array1 = {3,7,9,2};
    int [] array2 = {3,7,9,2};
    int [] array3 = {3,7,9,2};
    System.out.println("array1 and array2 identical?" +NumberUtils.isIdentical(array1,array2));
    System.out.println("array2 and array3 identical"+ NumberUtils.isIdentical(array2, array3));
}
void main(String[] args) {
    int[] array1 = {3, 7, 9, 2};
    int[] array2 = {2, 3, 7, 9};
    int[] array3 = {3, 9, 7, 2, 5};

    System.out.println("array1 and array2 equal (any order)? " + NumberUtils.isEqual(array1, array2));
    System.out.println("array1 and array3 equal (any order)? " + NumberUtils.isEqual(array1, array3));
}
void main(String[] args) {
    int [] arrayA ={3, 7};
    int [] arrayB ={2, 3, 7, 9 };
    int [] arrayC ={2, 3, 7, 9 };

    System.out.println("arrayA is a subset of arrayB? " + NumberUtils.isSubset(arrayA, arrayB));
    System.out.println("arrayB is a subset of arrayC? " + NumberUtils.isSubset(arrayB, arrayC));

}
void main(String[] args) {
    int [] numbers ={5, 12 , 8 , 12, 7};
    int maxIndex =NumberUtils.getMax(numbers);

    if (maxIndex != -1) {
        System.out.println("the first occurence of"+ maxIndex +"is at index:" + maxIndex);
    }else
        System.out.println("the first occurence of"+ maxIndex +"not found in the array");
}
void main(String[] args) {
    int[] hardCodedArray = {10, 20, 10, 20, 60, 10, 5, 60, 5, 60};

    int[] randomArray = DataGenerator.GetRandomArray(10, 1, 100);

    System.out.println("Hard-coded array:" + Arrays.toString(hardCodedArray));
    System.out.println("Random array:" + Arrays.toString(randomArray));

    int maxIndex = NumberUtils.getMax(randomArray);
    int maxValue = (maxIndex != -1) ? randomArray[maxIndex] : Integer.MIN_VALUE;
    System.out.println("max value is " + maxValue);

    int firstPos = NumberUtils.GetPos(randomArray, maxValue);
    int lastPos = NumberUtils.GetLastPos(randomArray, maxValue);
    System.out.println("first occurence of" + firstPos + "is at index:" + firstPos);
    System.out.println("last occurence of" + lastPos + "is at index:" + lastPos);

    boolean identical = NumberUtils.isIdentical(hardCodedArray, randomArray);
    boolean equal = NumberUtils.isEqual(hardCodedArray, randomArray);
    boolean subset = NumbersUtils.isSubset(hardCodedArray, randomArray) || NumbersUtils.isSubset(randomArray, hardCodedArray);
    System.out.println("Identical?" + identical);
    System.out.println("equal?" + equal);
    System.out.println("subset?" + subset);
}











