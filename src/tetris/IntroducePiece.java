package tetris;

import java.util.Random;
import static tetris.TypePiece.*;

public class IntroducePiece {
    Stage stage;
    Piece piece;
    int[] position = new int[2];
    Random rnd = new Random();
    int next1 = (int)(rnd.nextDouble() * 7);
    int next2 = (int)(rnd.nextDouble() * 7);

    public IntroducePiece(Stage stage) {
        switch (next1) {
            case 0: //L
                this.piece = new Piece(L);
                for (int i = 0; i < 3; i++) {
                    for (int j = 4; j < 8; j++) {
                        stage.stageMatrix[i][j] = piece.matrixPieces[i][j-4];
                    }
                }
                this.position[0] = 0;
                this.position[1] = 4;
                loadNextPiece();
                break;
            case 1: //LINV
                this.piece = new Piece(LINV);
                for (int i = 0; i < 4; i++) {
                    for (int j = 4; j < 8; j++) {
                        stage.stageMatrix[i][j] = piece.matrixPieces[i][j-4];
                    }
                }
                this.position[0] = 0;
                this.position[1] = 4;
                loadNextPiece();
                break;
            case 2: //T
                this.piece = new Piece(T);
                for (int i = 0; i < 4; i++) {
                    for (int j = 4; j < 8; j++) {
                        stage.stageMatrix[i][j] = piece.matrixPieces[i][j-4];
                    }
                }
                this.position[0] = 0;
                this.position[1] = 4;
                loadNextPiece();
                break;
            case 3: //I
                this.piece = new Piece(I);
                for (int i = 0; i < 4; i++) {
                    for (int j = 3; j < 7; j++) {
                        stage.stageMatrix[i][j] = piece.matrixPieces[i][j-3];
                    }
                }
                this.position[0] = 0;
                this.position[1] = 3;
                loadNextPiece();
                break;
            case 4: //SQU
                this.piece = new Piece(SQU);
                for (int i = 0; i < 4; i++) {
                    for (int j = 4; j < 8; j++) {
                        stage.stageMatrix[i][j] = piece.matrixPieces[i][j-4];
                    }
                }
                this.position[0] = 0;
                this.position[1] = 4;
                loadNextPiece();
                break;
            case 5: //Z
                this.piece = new Piece(Z);
                for (int i = 0; i < 4; i++) {
                    for (int j = 4; j < 8; j++) {
                        stage.stageMatrix[i][j] = piece.matrixPieces[i][j-4];
                    }
                }
                this.position[0] = 0;
                this.position[1] = 4;
                loadNextPiece();
                break;
            case 6: //ZINV
                this.piece = new Piece(ZINV);
                for (int i = 0; i < 4; i++) {
                    for (int j = 4; j < 8; j++) {
                        stage.stageMatrix[i][j] = piece.matrixPieces[i][j-4];
                    }
                }
                this.position[0] = 0;
                this.position[1] = 4;
                loadNextPiece();
                break;
        }
    }

    private void loadNextPiece() {
        next1 = next2;
        next2 = (int)(rnd.nextDouble() * 7);
    }
    
}
