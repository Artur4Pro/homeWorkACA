package company.day23.arrayList;

import company.day23.List;

import java.util.Iterator;

public class ArrayList implements List {

    private int defaultSize = 10;
    private int[] arrayLists = new int[defaultSize];
    private int counterElements;

    private void defaultSizeEnlarger (){
        defaultSize += (defaultSize * 0.5);
        int[] constant = arrayLists;
        arrayLists = new int[defaultSize];
        for (int i = 0; i < counterElements; i++) {
            arrayLists[i] = constant[i];
        }
    }
    @Override
    public int size() {
        return counterElements;
    }

    @Override
    public boolean isEmpty() {
        return arrayLists == null;
    }

    @Override
    public int get(int index) {
        if (index>counterElements){
            throw new IndexOutOfBoundsException();
        }
        return arrayLists[index];
    }

    @Override
    public void add(int val) {
        arrayLists[counterElements] = val;
        counterElements++;

        if (counterElements == defaultSize) {
            defaultSizeEnlarger();
        }
    }

    @Override
    public void add(int index, int val) {
        if (index>counterElements){
            throw new IndexOutOfBoundsException();
        }

        int element = arrayLists[index];
        arrayLists[index]=val;
        counterElements++;

        if (counterElements == defaultSize) {
            defaultSizeEnlarger();
        }

        for (int i = index + 1; i < counterElements; i++) {
            int cons = arrayLists[i];
            arrayLists[i]=element;
            element=cons;
        }


    }

    @Override
    public void delete(int index) {
        if (index>counterElements){
            throw new IndexOutOfBoundsException();
        }
        for (int i = index; i < counterElements; i++) {
            arrayLists[i]=arrayLists[i+1];
        }
        counterElements--;
    }

    @Override
    public Iterator iterator() {
        return new ListIterator();
    }
    private class ListIterator implements Iterator<Integer>{

        private int size;

        @Override
        public boolean hasNext() {
            return size<counterElements ;
        }

        @Override
        public Integer next() {
            Integer value = arrayLists[size];
            size++;
            return value ;
        }
    }
}
