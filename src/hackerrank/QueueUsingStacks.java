package hackerrank;

import java.util.ArrayDeque;

public class QueueUsingStacks {

    public static void main(String[] args) {

    }



}

class MyQueue<T> {

    ArrayDeque<T> inbox;
    ArrayDeque<T> outbox;

    public MyQueue() {
        this.inbox = new ArrayDeque<>();
        this.outbox = new ArrayDeque<>();
    }

    public void enqueue(T t){
        inbox.push(t);
    }
    public T dequeue(){

        if(outbox.isEmpty()) {
            while(!inbox.isEmpty()){
                outbox.push(inbox.pop());
            }
            return outbox.pop();
        }
        else{
            return outbox.pop();
        }
    }

    public T peek(){
        if(outbox.isEmpty()) {
            while(!outbox.isEmpty()){
                outbox.push(inbox.pop());
            }
            return outbox.peek();
        }
        else{
            return outbox.peek();
        }
    }

}