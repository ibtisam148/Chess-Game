/*
This file is related to moving the chess pieces.
It has two attributes rankMove and fileMove, which represent the rank and file of the move.
*/
public class Moving {
    int rankMove;
    int fileMove;

    public Moving(char rankMove, int fileMove) {
        this.rankMove = rankMove - 65;
        this.fileMove = fileMove - 1;
    }
//This function sets the rankMove and fileMove
    public Moving(int rankMove, int fileMove) {
        this.rankMove = rankMove;
        this.fileMove = fileMove;
    }


}
