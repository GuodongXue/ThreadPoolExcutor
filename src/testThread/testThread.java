package testThread;

public class testThread implements Runnable{

    @Override
    //内容就是执行的内容
    public void run() {
        System.out.println("Current thread"+Thread.currentThread());
    }
}
