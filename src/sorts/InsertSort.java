package sorts;

import lists.LinkedList;

public class InsertSort {

    public static void main(String... args){
        LinkedList list = new LinkedList();
        list.add(5);
        list.add(1);
        list.add(10);
        list.add(9);
        list.add(4);
        list.add(3);
        list.add(0);
        for (int x = 1; x < list.size(); x++){
            findIndexToSwap(list,x);
        }
        System.out.println(list);
    }

    private static void findIndexToSwap(LinkedList list, int index){
        while(index>0 && list.smaller(index, index-1)){
            list.swap(index, index-1);
            index--;
        }
    }

}
