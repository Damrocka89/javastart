package pl.sda.javastart.Homework1;

public class HomeworkCaughtSpeeding {

    public static void main(String[] args) {

        System.out.println(caughtSpeeding(64, true));
    }

    public static int caughtSpeeding(int speed, boolean isPolicemanHappy){
        if (isPolicemanHappy){
            speed=speed-5;
        }
        if (speed>50 && speed<=60){
            return 100;
        }else if (speed>60 && speed<=70){
            return 200;
        }else{
            return  300;
        }
    }
}
