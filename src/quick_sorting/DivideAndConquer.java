package quick_sorting;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DivideAndConquer {
    public static void main(String[] args) {
        int[] mas = {-100,2,30,4,5,7}; // Сумма 22, 6 элементов
        System.out.println(sumReq(mas,mas.length - 1));

        //List<Integer> list = new ArrayList<>(Arrays.asList(5,2,3,4,5,3,3,3)); // 8 элементов
        System.out.println(maxValue(mas, mas.length-1, 0));

    }

    // Суммирование элементов массива через рекурсию
    public static int sumReq(int[] arr, int lastIndex){
        if(lastIndex == 0) return arr[0];
        return arr[lastIndex] + sumReq(arr, lastIndex - 1);
    }

    // Рекурсивный поиск элемента с максимальным значением
    public static int maxValue(int[] arr, int lastIndex, int initialValue){
        if(lastIndex == 0) return initialValue;

        if(arr[lastIndex] <= initialValue){
            return maxValue(arr, lastIndex - 1, initialValue);
        } else{
            return maxValue(arr, lastIndex - 1, arr[lastIndex]);
        }
    }

}
