package hash_tables;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Stream;

public class HashFunct {
    public static void main(String[] args) {
        Hash mapa = new Hash(10);
        mapa.add("Сахар", 10);
        mapa.add("Вода", 20);
        mapa.add("Молоко", 80);
        mapa.add("Ваниль", 100);
        mapa.add("Хлеб", 35);
        mapa.add("Сок",  120);
        mapa.add("Мясо", 380);
        mapa.add("Колбаса", 400);
        mapa.add("Варенье", 90);
        mapa.add("Сметана", 85);


        System.out.println(mapa.getPrice("Сок"));
    }

}

class Hash{
    int counter = 0;
    int size;
    String[] names;
    int[] prices;

    public Hash(int size){
        this.size = size;
        names = new String[size];
        prices = new int[size];
    }

    public void add(String name, int price){
        if(!Arrays.asList(names).contains(name) && (counter <= size)){
            names[counter] = name;
            prices[counter] = price;
            counter++;
        } else {
            if(counter > size){
                System.out.println("Больше нет места в таблице");
            } else{
                System.out.println("Такой элемент уже есть в таблице");
            }
        }

    }

    public int getPrice(String name){
        ArrayList<String> namesList;
        int nameIndex;

        namesList = new ArrayList<>(Arrays.asList(names));
        nameIndex = namesList.indexOf(name);

        return prices[nameIndex];
    }

    public void printAll(){
        for(int i=0; i<counter; i++){
            System.out.println(names[i] + ": " + prices[i] + " рублей");
        }
    }


}
