public class Moving {
    int rankMove;
    int fileMove;

    public Moving(char rankMove, int fileMove) {
        this.rankMove = rankMove - 65;
        this.fileMove = fileMove - 1;
    }

    public Moving(int rankMove, int fileMove) {
        this.rankMove = rankMove;
        this.fileMove = fileMove;
    }


}
