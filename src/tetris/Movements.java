package tetris;

import static tetris.TypeMovements.*;

public class Movements {
    int[] position;

    public Movements(int[] position, TypeMovements type, int[][] stageMatrix, int[][] matrixPiece) {
        this.position = new int[2];
        switch (type) {
            case LEFT:
                this.position = moveLeft(position, stageMatrix, matrixPiece);
                break;
            case RIGHT:
                this.position = moveRight(position, stageMatrix, matrixPiece);
                break;
            case ROTATE:
                this.position = moveRotate(position, stageMatrix, matrixPiece);
                break;
            case DOWN:
                this.position = moveDown(position, stageMatrix, matrixPiece);
                break;
            case FALL:
                this.position = moveFall(position, stageMatrix, matrixPiece);
                break;
        }
    }
    
    private boolean fell(int[] position, int[][] stageMatrix) {
        return false;
    }
    
    private int[] moveLeft(int[] position, int[][] stageMatrix, int[][] matrixPiece) {
        if (!fell(position, stageMatrix) && position[2] > 0) {
            position[2] = position[2] - 1;
        }
        return position;
    }
    
    public static void main(String[] args) {
        System.out.println ("Comienza el juego:");
        int[] pos = new int[] {0,1};
        int[][] stageMatrix = new int[][] {{0,0,0,0,0},{0,0,0,0,0},{0,0,0,0,0},{0,0,0,0,0}};
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                if (j == 0) System.out.println("");
                System.out.print(stageMatrix[i][j]);
            }
        }
        System.out.println("\n");
        
        int[][] matrixPiece = new int[][] {
            {1,0},
            {1,0},
            {1,1}}; //L
        
        int result;
        
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                if ((pos[1] == i) && (pos[2] == j)) {
                    stageMatrix[i][j] = matrixPiece[i-pos[1]][j-pos[2]];
                }
            }
        }
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                if (j == 0) System.out.println("");
                System.out.print(stageMatrix[i][j]);
            }
        }
        System.out.println("\n");
        
    }
    
    private int[] moveRight(int[] position, int[][] stageMatrix, int[][] matrixPiece) {
        if (!fell(position, stageMatrix) && position[2] < 9) {
            position[2] = position[2] + 1;
        }
        return position;
    }
    
    private int[] moveRotate(int[] position, int[][] stageMatrix, int[][] matrixPiece) {
        return position;
    }
    
    private int[] moveDown(int[] position, int[][] stageMatrix, int[][] matrixPiece) {
        if (!fell(position, stageMatrix) && position[1] < 19) {
            position[1] = position[1] + 1;
        }
        return position;
    }
    
    private int[] moveFall(int[] position, int[][] stageMatrix, int[][] matrixPiece) {
        return position;
    }
        
}
