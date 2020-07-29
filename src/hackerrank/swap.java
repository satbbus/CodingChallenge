package hackerrank;

import java.util.concurrent.atomic.AtomicInteger;

class MyInteger{
    private int value;
    public void set(int value){
        this.value = value;
    }
    public int get(){
        return value;
    }
    MyInteger() {
    }

    MyInteger(int val){
        this.value = val;
    }
}

public class swap {

    public static void main(String[] args) {
        MyInteger a = new MyInteger(10);
        MyInteger b = new MyInteger(20);
        swapint(a,b);
        System.out.println("a="+a.get()+"\nb="+b.get());
    }

    public static void swapint(MyInteger a, MyInteger b){
        MyInteger temp = new MyInteger();
        temp.set(a.get());
        a.set(b.get());
        b.set(temp.get());

    }

}
