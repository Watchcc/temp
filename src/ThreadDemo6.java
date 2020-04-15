public class ThreadDemo6 {
    public static void main(String[] args) {
        Business business=new Business();
        for(int i=0;i<2;i++){
            new Thread(new Runnable() {

                @Override
                public void run() {
                    business.inc();
                }
            }).start();
            new Thread(new Runnable() {

                @Override
                public void run() {
                    business.dec();
                }
            }).start();
        }
    }
}
class Business{
    int j=100;
    public synchronized void inc(){
        j++;
        System.out.println(Thread.currentThread().getName()+"-inc:"+j);
    }

    public synchronized void dec(){
        j--;
        System.out.println(Thread.currentThread().getName()+"-dec:"+j);
    }
}
