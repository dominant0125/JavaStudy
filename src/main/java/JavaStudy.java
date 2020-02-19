import Enum.*;
import ModernJava.*;

import java.util.concurrent.TimeUnit;

public class JavaStudy {
    public static void main(String[] args) {

        FunctionalInterfaceExample1 ex1 = new FunctionalInterfaceExample1();
        ex1.examFunction("10000");
        ex1.examConsumer("Consumer Test");
        ex1.examPredicate(1);

        long start = System.currentTimeMillis();
        ex1.examSupplier(0, getVeryExpensiveValue());
        ex1.examSupplier(-1, getVeryExpensiveValue());
        ex1.examSupplier(-2, getVeryExpensiveValue());

        System.out.println("It tooks " + ((System.currentTimeMillis() - start) /1000)+ " seconds.");
    }

    private static String getVeryExpensiveValue(){
        try{
            TimeUnit.SECONDS.sleep(3);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        return "DOMINANT";
    }
}
