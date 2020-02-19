package Thread;

public class ThreadStudy2 implements Runnable{
    private int[] temp;

    public ThreadStudy2(){
        temp = new int[10];

        for ( int i = 0 ; i < temp.length ; i++){
            temp[i] = i;
        }
    }

    @Override
    public void run() {
        for ( int each : temp){
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e ){
                e.printStackTrace();
                // TODO >> Handle Exception
            }

            System.out.println("thread Name :: " + Thread.currentThread().getName());
            System.out.println("temp value :: " + each);
        }

    }
}
