public class Worker {


    public void execute(Runnable action, int nTimes) {
        Thread thread = new Thread();
        for (int i = 0; i < nTimes; i++) {
            thread = new Thread(action);
            thread.start();
        }

        try {
            thread.join();
        } catch (InterruptedException e) {
        }
    }
}
