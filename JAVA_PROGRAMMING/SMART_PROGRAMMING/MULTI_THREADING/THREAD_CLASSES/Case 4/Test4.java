import java.util.*;

// 4. Performing multiple task from multiple thread.

class playVideo extends Thread{
    public void run(){
        System.out.println("Playing Video.");
    }
}

class playAudio extends Thread{
    public void run(){
        System.out.println("Playing Music.");
    }
}

class progressBar extends Thread{
    public void run(){
        System.out.println("Progress bar is executing.");
    }
}

class playTimer extends Thread{
    public void run(){
        System.out.println("Timer is executing.");
    }
}

public class Test4 {
    public static void main(String[] args) {
        playVideo thread1 = new playVideo();
        thread1.start();

        playAudio thread2 = new playAudio();
        thread2.start();

        progressBar thread3 = new progressBar();
        thread3.start();
        
        playTimer thread4 = new playTimer();
        thread4.start();
    }
}
