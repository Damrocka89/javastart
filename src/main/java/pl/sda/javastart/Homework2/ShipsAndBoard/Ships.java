package pl.sda.javastart.Homework2.ShipsAndBoard;


public class Ships {

    private static final int POINTS_FOR_HIT=100;

    private Board playerOneBoard;
    private Board playerTwoBoard;
    private int playerOnePoints=0;
    private int playerTwoPoints=0;


    public Ships(int boardWidth, int boardHeight) {
        this.playerOneBoard = new Board(boardHeight,boardWidth);
        this.playerTwoBoard = new Board(boardHeight,boardWidth);
    }

    public boolean playerOneAddShip(Coordinates start, Coordinates end){
        return playerOneBoard.addShip(start, end);
    }

    public  boolean playerTwoAddShip(Coordinates start, Coordinates end){
        return playerTwoBoard.addShip(start, end);
    }

    public boolean playerOneShoot(Coordinates shot){
        boolean hit=playerTwoBoard.shoot(shot);
        if (hit){
            playerOnePoints=playerOnePoints+POINTS_FOR_HIT;
        }
        return hit;
    }

    public boolean playerTwoShoot(Coordinates shot){
        boolean hit=playerOneBoard.shoot(shot);
        if (hit){
            playerTwoPoints=playerTwoPoints+POINTS_FOR_HIT;
        }
        return hit;
    }
    public boolean isGameOver(){
        return playerOneBoard.isGameOver() || playerTwoBoard.isGameOver();
    }

    public int playerOnePoints() {
        return playerOnePoints;
    }

    public int playerTwoPoints() {
        return playerTwoPoints;
    }
}
