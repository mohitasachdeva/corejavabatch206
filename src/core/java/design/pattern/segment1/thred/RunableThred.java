package core.java.design.pattern.segment1.thred;

public class RunableThred implements Runnable{
    @Override
    public void run() {
        System.out.println("thread start");
    }

    public static void main(String[] args) {
        RunableThred runableThred = new RunableThred();
        Thread thread = new Thread(runableThred);
        thread.start();
    }
}
