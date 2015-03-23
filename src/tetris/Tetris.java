package tetris;

public class Tetris {
    static Stage stage = new Stage();
    static IntroducePiece introducePiece = new IntroducePiece(stage);
    
    /*
    public static void main(String[] args) {
        System.out.println ("Comienza el juego:");
        Tetris tetris = new Tetris();
        
    }
    
    */
    public Tetris() {
        stage.printStage();
        for (int i = 0; i < 19; i++) {
            Advance advance = new Advance(stage);
            advance.timeSleeping(1);
            stage.printStage();
        }
        introducePiece = new IntroducePiece(stage);
        stage.printStage();
        for (int i = 0; i < 19; i++) {
            Advance advance = new Advance(stage);
            advance.timeSleeping(1);
            stage.printStage();
        }
    }
    
}
