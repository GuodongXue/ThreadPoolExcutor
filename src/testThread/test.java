package testThread;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class test {
    public static void main(String[] args) {
        ThreadPoolExecutor t = new ThreadPoolExecutor(1, 2, 3, TimeUnit.MILLISECONDS,
                new LinkedBlockingDeque<>(3));

        //放一个任务，由核心线程帮我执行
        t.execute(new testThread());
        //放第二个任务
        t.execute(new testThread());
        //放第三个任务
        t.execute(new testThread());
        //放第四个任务
        t.execute(new testThread());
        //放第五个任务
        t.execute(new testThread());
        //并且与核心线程分摊任务
            //放第六个任务
            t.execute(new testThread());
            //报错， 拒绝执行

    }
}
