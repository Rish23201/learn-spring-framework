package game;

public class GameRunner1 {
    SuperContra gamer;
    public GameRunner1(SuperContra gamer) {
        this.gamer = gamer;

    }

    public void run() {
        gamer.up();
        gamer.down();
        gamer.left();
        gamer.right();
    }
}
