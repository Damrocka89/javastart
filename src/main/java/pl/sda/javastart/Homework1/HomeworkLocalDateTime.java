package pl.sda.javastart.Homework1;

import java.time.LocalDateTime;

public class HomeworkLocalDateTime {

    public static void main(String[] args) {
        time();
    }

    public static void time() {
        int minuta = LocalDateTime.now().getMinute();
        int godzina = LocalDateTime.now().getHour();
        int rok = LocalDateTime.now().getYear();
        int miesiac = LocalDateTime.now().getMonthValue();
        int dzien = LocalDateTime.now().getDayOfMonth();
        System.out.println(godzina + ":" + minuta + " " + dzien + "." + miesiac + "." + rok);
        int minPoPolnocy=60*godzina+minuta;
        System.out.println("Od północy minęło "+minPoPolnocy+" min");
        double procentDoby=((double)(60*godzina+minuta)/(double)(24*60))*100;
        System.out.println("Minęło "+procentDoby+"% doby");
        int sekundDoKonca=24*60*60-(60*godzina+minuta)*60-LocalDateTime.now().getSecond();
        System.out.println("Do końca doby zostało "+sekundDoKonca+" sekund");


    }
}
