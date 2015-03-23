package tetris;

public class Stage {
    int[][] stageMatrix;    
    
    public Stage() {
        this.stageMatrix = new int[20][10];
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 10; j++) {
                this.stageMatrix[i][j] = 0;
            }
        }
    }
    
    public void printStage() {
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 10; j++) {
                if (j == 0) System.out.println("");
                System.out.print(stageMatrix[i][j]);
            }
        }
        System.out.println("\n");
    }
    
}
