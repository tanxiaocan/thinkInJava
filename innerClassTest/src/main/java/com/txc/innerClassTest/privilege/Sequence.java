package com.txc.innerClassTest.privilege;

/**
 * Created by tanxiaocan on 2016/9/10.
 */
public class Sequence {
    private Object[] items;
    private int next = 0;
    public Sequence(int size){
        items = new Object[size];
    }
    public void add(Object item){
        if(next < items.length){
            items[next++] = item;
        }
    }
    private class SequenceSelector implements Selector{
        private int index = 0;

        public boolean end() {
            return index == items.length;
        }

        public Object current() {
            return items[index];
        }

        public void next() {
            if(index < items.length){
                index++;
            }
        }
    }
    public SequenceSelector selector(){
        return new SequenceSelector();
    }
}
