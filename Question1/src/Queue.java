
public class Queue {
    
    private PrintTask que[];
    private int front, rear, capacity;
    
    public Queue(int c){
        front = 0;
        rear = 0;
        capacity = c;
        que = new PrintTask[capacity];
    }
    
    public void enqueue(PrintTask task) {
        if (rear == capacity) {
            System.out.println("Queue is full. Cannot enqueue task.");
            return;
        }
        que[rear] = task;
        rear++;
        System.out.println("Task enqueued successfully.");
    }
    
    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue task.");
            return;
        }
        PrintTask dequeuedTask = que[front];
        front++;
        System.out.println("Dequeued task: " + dequeuedTask);
    }
    
    public boolean isEmpty() {
        return front == rear;
    }
    
    public PrintTask peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot peek task.");
            return null;
        }
        return que[front];
    }
    
    public void clear() {
        front = 0;
        rear = 0;
        System.out.println("Queue cleared successfully.");
    }
    
    public int size() {
        return rear - front;
    }
    
    
    public void printQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot print queue.");
            return;
        }
        System.out.println("Printing queue:");
        for (int i = front; i < rear; i++) {
            System.out.println(que[i]);
        }
    }
    

   static public class PrintTask {
        private String document;
    
        public PrintTask(String document) {
            this.document = document;
        }
    
        public String getDocument() {
            return document;
        }
    
        @Override
        public String toString() {
            return "PrintTask{" +
                    "document='" + document + '\'' +
                    '}';
        }
    }
  
    

    public static void main(String[] args) {
        Queue printerQueue = new Queue(5);
        
        
        PrintTask task1 = new PrintTask("Document1");
        PrintTask task2 = new PrintTask("Document2");
        PrintTask task3 = new PrintTask("Document3");
        
        printerQueue.enqueue(task1);
        printerQueue.enqueue(task2);
        printerQueue.enqueue(task3);
        
        printerQueue.dequeue();
        printerQueue.dequeue();
        
        PrintTask peekedTask = printerQueue.peek();
        System.out.println("Peeked task: " + peekedTask);
        
        printerQueue.clear();
        
        printerQueue.printQueue();
        System.out.println("Queue size: " + printerQueue.size());
        printerQueue.clear();
    }
}