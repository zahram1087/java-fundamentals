import java.time.LocalDateTime;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
//        pluralize ("cat", 1 );
//        flipNHeads(1);
        clock();


    }

    public static void pluralize(String name, int count) {
        if (count >= 0 && count != 1) {
            System.out.println("I own " + count + " " + name + "s");
        } else {
            System.out.println("I own " + count + " " + name);
        }
    }

    public static void flipNHeads(int n) {
//
        int headscounter = 0;
//
        do {
            int num = ThreadLocalRandom.current().nextInt(0, 2);
//            headscounter++;
            if (num < .5) {
                headscounter++;
                System.out.println("heads");

            } else {
                System.out.println("Tails");
            }

        } while (headscounter < n);
        System.out.println("It took " + headscounter + " to flips " + n + " in a row");
    }

    public static void clock() {

    //Thread.sleep in Java. Thread.sleep() method can be used to pause the
        // execution of current thread for specified time in milliseconds
        //thread to suspend execution for a specified period. 

        Thread clock = new Thread()
        {
            public void run ()
            {
                try {
                    for(;;) { //never ending loop can also use while(true)_
                        LocalDateTime now = LocalDateTime.now();
                        int hour = now.getHour();
                        int minute = now.getMinute();
                        int second = now.getSecond();
                        System.out.println("Time: " + hour + ": " + minute + ": " + (double)second);

                        sleep(1000);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        clock.start();






    }
}
