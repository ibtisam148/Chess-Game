public class Chess {

    public class Selected{
        int rankSelect;
        char fileSelect;

    }

    public class Moving{
        int rankMove;
        char fileMove;

    }

    public static void main(String[] args) {
        ChessBoard Game = new ChessBoard();
        char[] select = new char[2];
        Game.chessBoardPrint();


    }

}

