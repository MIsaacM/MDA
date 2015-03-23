package tetris;

public class Advance {

    public Advance(Stage stage) {
        for (int i = 19; i > -1; i--) {
            for (int j = 0; j < 10; j++) {
                if ((i+1) < 20 && stage.stageMatrix[i][j] == 1 && stage.stageMatrix[i+1][j] == 0) {
                    stage.stageMatrix[i+1][j] = 1;
                    stage.stageMatrix[i][j] = 0;
                }
            }
        }
    }

    public Advance(Stage stage, int[] position) {
        for (int i = position[0] + 3; i > position[0] - 1; i--) {
            for (int j = position[1]; j < position[1] + 4; j++) {
                if ((i+1) < 20 && stage.stageMatrix[i][j] == 1 && stage.stageMatrix[i+1][j] == 0) {
                    stage.stageMatrix[i+1][j] = 1;
                    stage.stageMatrix[i][j] = 0;
                    position[0] += 1;
                }
            }
        }
    }
    
    
    public void timeSleeping(int seconds) {
        try {
            Thread.sleep(seconds*500);
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error en el tiempo de espera.");
        }
    }
    
}
