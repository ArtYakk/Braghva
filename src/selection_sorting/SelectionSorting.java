package selection_sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SelectionSorting {
    public static void main(String[] args) {
        int[] arr = {1, 3, -15, 6, 7, 8, -9, 1, 4, 6};

        arr = selectingSort(arr);

        System.out.println(Arrays.toString(arr));

    }

    public static int[] selectingSort(int[] arr){
        int[] newArr = new int[arr.length];

        ArrayList<Integer> array = new ArrayList<>(Arrays.stream(arr).boxed().toList());

        for(int i=0; i<newArr.length; i++){
            int minIndex = findMin(array);
            newArr[i] = array.remove(minIndex);
        }

        return newArr;
    }

    public static int findMin(List<Integer> array){
        int min = array.get(0);
        int minIndex = 0;

        for(int i=1; i<array.size(); i++){
            if(array.get(i) < min){
                min = array.get(i);
                minIndex = i;
            }
        }

        return minIndex;
    }

}
