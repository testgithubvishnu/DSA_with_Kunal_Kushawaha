
// Multi-threading using extending Thread class
class thread1 extends Thread{
    
      
        public void run(){
            int i=0;
            while(i<10)
            {
            System.out.println("my thread 1 is running");
            System.out.println("hello thread 1");
            i++;
            }
        }
    
}
class thread2 extends Thread{
    
        public void run(){
            int i=0;
            while(i<10)
            {
            System.out.println("my thread 2 is running");
            System.out.println("hello thread 2");
            i++;
            }
        }
    
}

class mainthread extends Thread{
    public static void main(String[] args)
    {
       thread1 obj1= new thread1();
        thread2 obj2= new thread2();
        obj1.start();
        obj2.start();
    }


}