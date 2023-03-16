public class Main {
    static final int SIZE= 3;
    public static void main(String[] args) {





    }
    public void enqueue(int val){
        int[] arr = new int[SIZE];
        int rear = 0;  //this is where insertion happens

        if(rear == SIZE)
            System.out.println("the queue is full");
        else {
            arr[rear] = val;
            ++rear;
        }

    }
    public static void dequeue(int[] arr){
        int rear = 0;  //this is where insertion happens
        int front = 0; //this is where deletion happens
        if(rear == front)
            System.out.println("is empty");
        else {
            System.out.println("delete "+arr[front]);
            ++front;
        }

    }
}