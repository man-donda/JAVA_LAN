import java.util.*;

class Medical extends Thread {
    public void run() {
        try {
            System.out.println("Medical Checking");
            Thread.sleep(3000);
            System.out.println("Medical checked");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class testDrive extends Thread{
    public void run(){
        try{
            System.out.println("Licence Test - drive start");
            Thread.sleep(5000);
            System.out.println("Licence Test - drive Complated");
        }catch(Exception e){
            System.out.println(e);
        }
    }
}

class officerSign extends Thread{
    public void run(){
        try{
            System.out.println("Officer checking start");
            Thread.sleep(3000);
            System.out.println("Officer sign complated");
        }catch(Exception e){
            System.out.println(e);
        }
    }
}

public class LicenceDemo {
    public static void main(String[] args) throws InterruptedException
    {
        Medical medical = new Medical();
        medical.start();

        medical.join();

        testDrive td = new testDrive();
        td.start();

        td.join();

        officerSign os = new officerSign();
        os.start();
    }
}
