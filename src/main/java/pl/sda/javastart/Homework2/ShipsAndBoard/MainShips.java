package pl.sda.javastart.Homework2.ShipsAndBoard;

import java.util.Random;

public class MainShips {
    public static void main(String[] args) {

        int boardWidth=10;
        int boardHeight=20;
        Random random=new Random();
        Ships shipsGame=new Ships(boardWidth,boardHeight);

        shipsGame.playerOneAddShip(new Coordinates(0, 0), new Coordinates(0, 3));
        shipsGame.playerOneAddShip(new Coordinates(9, 5), new Coordinates(9, 6));
        shipsGame.playerOneAddShip(new Coordinates(3, 4), new Coordinates(6, 4));
        shipsGame.playerOneAddShip(new Coordinates(5, 10), new Coordinates(9, 10));

        shipsGame.playerTwoAddShip(new Coordinates(0, 0), new Coordinates(0, 3));
        shipsGame.playerTwoAddShip(new Coordinates(9, 15), new Coordinates(9, 19));
        shipsGame.playerTwoAddShip(new Coordinates(3, 4), new Coordinates(6, 4));
        shipsGame.playerTwoAddShip(new Coordinates(5, 10), new Coordinates(9, 10));

        while (!shipsGame.isGameOver()){
            Coordinates playerOneShot=randomCoordinates(random,boardWidth,boardHeight);
            boolean hit=shipsGame.playerOneShoot(playerOneShot);
            if (hit){
                System.out.println("Trafiony! Punkty gracza nr 1: "+shipsGame.playerOnePoints());
            }
            Coordinates playerTwoShot=randomCoordinates(random,boardWidth,boardHeight);
            hit=shipsGame.playerTwoShoot(playerTwoShot);
            if (hit){
                System.out.println("Trafiony! Punkty gracza nr 2: "+shipsGame.playerTwoPoints());
            }
        }

    }

    private static Coordinates randomCoordinates (Random random, int boardWidth, int boardHeight){
        return new Coordinates(random.nextInt(boardWidth), random.nextInt(boardHeight));
    }
}
