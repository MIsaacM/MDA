package tetris;

public class Piece {
    int[][] matrixPieces;
    
    public Piece(TypePiece type) {
        this.matrixPieces = new int[4][4];
        switch (type) {
            case L:
                this.matrixPieces = new int[][] {{1,0,0,0},{1,0,0,0},{1,1,0,0},{0,0,0,0}};
                break;
            case LINV:
                this.matrixPieces = new int[][] {{0,1,0,0},{0,1,0,0},{1,1,0,0},{0,0,0,0}};
                break;
            case T:
                this.matrixPieces = new int[][] {{1,1,1,0},{0,1,0,0},{0,0,0,0},{0,0,0,0}};
                break;
            case I:
                this.matrixPieces = new int[][] {{1,1,1,1},{0,0,0,0},{0,0,0,0},{0,0,0,0}};
                break;
            case SQU:
                this.matrixPieces = new int[][] {{1,1,0,0},{1,1,0,0},{0,0,0,0},{0,0,0,0}};
                break;
            case Z:
                this.matrixPieces = new int[][] {{1,1,0,0},{0,1,1,0},{0,0,0,0},{0,0,0,0}};
                break;
            case ZINV:
                this.matrixPieces = new int[][] {{0,1,1,0},{1,1,0,0},{0,0,0,0},{0,0,0,0}};
                break;
        }
    }
    
}
