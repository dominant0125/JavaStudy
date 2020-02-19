package Thread;

public class ThreadStudyAtm implements Runnable{

    public long deposite = 10000;

    @Override
    public void run() {

        synchronized(this) {
            for(int i = 0 ; i < 10 ; i++ ){
                notify();
                try {
                    wait();
                    Thread.sleep(1000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                    // TODO >> Handle Exception
                }

                if ( getDeposite() <= 0 )
                    break;
                withdraw(1000);
            }
        }
    }

    long getDeposite(){
        return this.deposite;
    }

    void withdraw(long amt){
        if ( getDeposite() > 0 ){
            this.deposite -= amt;
            System.out.print(Thread.currentThread().getName() + " , ");
            System.out.println(String.format("잔액 : %,d 원", this.deposite));
        }else{
            System.out.print(Thread.currentThread().getName() + " , ");
            System.out.println("잔액 부족!");
        }
    }
}
