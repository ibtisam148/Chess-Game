import java.util.Scanner;

/*
Sample
*/
public class Chess {

    public static void main(String[] args) {
        String input;
        Selected selected = new Selected(1, 1);
        Moving moving;
        int move = 1;

        ChessBoard Game = new ChessBoard();

        //Game.chessBoardPrint();

        System.out.println("Welcome to the game of Chess");
        Game.chessBoardPrint();
        System.out.printf("\n        Move number = %d\n\n", move);
        if (move % 2 == 0) {
            System.out.print("        Black's Move.\n\n");
        } else {
            System.out.print("        White's Move.\n\n");
        }

        System.out.printf("Select Piece to move(e.i a1,b2,..):");

        Scanner scanner = new Scanner(System.in);

        input = scanner.next();

        input = input.toUpperCase();

        char[] input1 = input.toCharArray();

        selected = new Selected(input1[0], Character.getNumericValue(input1[1]));

        System.out.println(selected.rankSelect + " " + selected.fileSelect);

        if (Game.selectionValidation(selected, move)) {

            System.out.printf("Enter Place to move to(e.i a1,b2,..):");

            input = scanner.next();

            input = input.toUpperCase();

            System.out.println(input);

            input1 = input.toCharArray();

            moving = new Moving(input1[0], Character.getNumericValue(input1[1]));

            Game.moveValidationAndMove(selected, moving);

        }

        Game.chessBoardPrint();




        /*boolean flag = false;
        boolean check = false;


        System.out.println("Welcome to the game of Chess");
        Game.chessBoardPrint();
        while(selected.fileSelect != 'Z')
        {
            System.out.printf("\n        Move number = %d\n\n",move);
            if(move%2==0)
            {
                System.out.print("        Black's Move.\n\n");
            }
            else
            {
                System.out.print("        White's Move.\n\n");
            }
            if(check==true)
            {
                if((move-1)%2==1)
                {
                    System.out.print("Black king is in check.\n");
                }
                else if((move-1)%2==0)
                {
                    System.out.printf("White king is in check.\n");
                }
            }

            //Piece selection
            System.out.printf("Select Piece to move(e.i a1,b2,..):");

            Scanner scanner =  new Scanner(System.in);

            input = scanner.next();

            input = input.toUpperCase();

            System.out.println(input);

            char[] input1  =  input.toCharArray();

            selected = new Selected(input1[0],Character.getNumericValue(input1[1]));



            if(selected.fileSelect == 'z')
            {
                break;
            }

            if(Game.selectionValidation(selected,move)==true) {
                //Location to move selection
                do {
                    System.out.printf("Enter Place to move to(e.i a1,b2,..):");

                    input = scanner.next();

                    input = input.toUpperCase();

                    System.out.println(input);

                    input1 = input.toCharArray();

                    moving = new Moving(input1[0], Character.getNumericValue(input1[1]));


                    //flag = moveValidation(from.rank_select,select,to.rank_move,moving2,move);
                }
                while (flag == false);
                Game.movement(selected, moving);
                move++;*/















        /*Scanner scanner =  new Scanner(System.in);

        input = scanner.next();

        input = input.toUpperCase();

        System.out.println(input);

        char[] input1  =  input.toCharArray();

        selected = new Selected(input1[0],Character.getNumericValue(input1[1]));

        System.out.println(selected.rankSelect +" "+ selected.fileSelect);


        input = scanner.next();

        input = input.toUpperCase();

        System.out.println(input);

        input1  =  input.toCharArray();

        moving = new Moving(input1[0],Character.getNumericValue(input1[1]));

        System.out.println(moving.rankMove +" "+ moving.fileMove);



            }
        }*/
    }
}
