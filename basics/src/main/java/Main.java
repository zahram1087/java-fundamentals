import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        pluralize ("cat", 1 );
        flipNHeads(3);
        clock();


    }

    public static void pluralize(String name, int count) {
        if (count >= 0 && count != 1 ) {
            System.out.println("I own " + count + " " + name + "s");
        } else {
            System.out.println("I own " + count + " " + name);
        }
    }

    public static void flipNHeads(int n) {
        String name;
        int headscounter = 0;
        int flips= 0;

        while (headscounter < n) {
            int num = ThreadLocalRandom.current().nextInt(0, 2);

            if (num < .5 ) {
                name = "heads";
                headscounter++;
                flips++;
                System.out.println(name);
            }
            else {
                name = "tails";
                flips++;
                headscounter=0;
                System.out.println(name);
            }

        } ; // !name.equals("heads")
        System.out.println("It took " +flips + " to flips " + n + " heads in a row");
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
                        String time = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
                        String.format(time, hour, minute,second);
                        System.out.println(time);

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
