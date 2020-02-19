package Thread;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreadStudy extends Thread{
    private int[] tempArray;

    public ThreadStudy(String threadName){
        super(threadName);

        tempArray = new int[threadName.length()];
        for (int i = 0 ; i < tempArray.length ; i++){
            tempArray[i] = i;
        }
    }

    public void run(){
        for (int each : tempArray){
            try{
                Thread.sleep(1000);

            }catch (InterruptedException e){
                e.printStackTrace();
                // TODO >> handle Exception
            }

            System.out.println("thread Name :: " +  currentThread().getName());
            System.out.println("temp value :: " + each);
        }
    }
}
