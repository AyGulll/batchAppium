package utils;

public class ReusableMethods {

    public void waitFor(int sec){
        try {
            Thread.sleep(sec*1000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
