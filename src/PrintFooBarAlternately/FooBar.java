package PrintFooBarAlternately;

import java.util.concurrent.CountDownLatch;

public class FooBar {
    private int n;
    private boolean printFooFlag = true;

    public FooBar(int n) {
        this.n = n;
    }

    public void foo(Runnable printFoo) throws InterruptedException {

        for (int i = 0; i < n; i++) {
            synchronized(this){
                if(printFooFlag){
                    printFoo.run();
                    printFooFlag = false;
                    this.notifyAll();
                } else{
                    i--;
                    this.wait();
                }
            }
        }
    }

    public void bar(Runnable printBar) throws InterruptedException {

        for (int i = 0; i < n; i++) {
            synchronized(this){
                if(!printFooFlag){
                    printBar.run();
                    printFooFlag = true;
                    this.notifyAll();
                } else{
                    i--;
                    this.wait();
                }
            }
        }
    }

}
