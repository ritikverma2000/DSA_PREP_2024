package HeapDataStructure;

import java.util.ArrayList;

class Heap <T extends Comparable<T>>{


    private ArrayList<T> list;

    public Heap(){
         list = new ArrayList<>();
    }
    public void swap(int first, int second){
        T temp = list.get(first);
        list.set(first,list.get(second));
        list.set(second,temp);
    }

    public int parent(int index){
        return (index-1)/2;
    }

    public int left(int index){
        return (index*2)+1;
    }
    public int right(int index){
        return (index*2)+2;
    }

    public void insert( T value){

        list.add(value);
        

    }





}
