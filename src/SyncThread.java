class MessageSender{
    public void send(String message){
        System.out.println("Sending the message "+message);
        try{
            Thread.sleep(1000);
        }
        catch (Exception e){
            System.out.println("Exception Caught");
        }
    }
}
class ThreadSender extends Thread{
    final private String message;
    MessageSender messageSender;
    ThreadSender(String str,MessageSender ms){
        message=str;
        messageSender=ms;
    }
    @Override
    public void run(){
        synchronized (messageSender){
            messageSender.send(message);
        }
    }
}
public class SyncThread {
    public static void main(String[] args) {
        MessageSender message = new MessageSender();
        ThreadSender t1 = new ThreadSender("Thread one sending",message);
        ThreadSender t2 = new ThreadSender("Thread two sending",message);
        t1.start();
        t2.start();
        try{
            t1.join();
            t2.join();
        }
        catch (Exception e){
            System.out.println("Exception caught");
        }
    }
}
