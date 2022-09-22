//class MyThread extends Thread
class MyThread implements Runnable
{
    @Override
    public void run(){
        System.out.println(Thread.currentThread().getId()+" is running");
    }
}

public class RunnableThread {
    public static void main(String[] args) {

        for(int i=0;i<10;i++)
        {
            //MyThread myThread = new MyThread();
            Thread myThread = new Thread(new MyThread());
            myThread.start();
        }
    }
}

