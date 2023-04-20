public class MySynchronizedThread implements Runnable {

    private static int ticket = 100;
    private static Object o = new Object();

    @Override
    public void run() {
        synchronized(o) {
            while (ticket > 0) {
                System.out.println(Thread.currentThread().getName() + " : " + ticket);
                ticket--;
            }
        }
    }
}
