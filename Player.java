import java.util.Scanner;

public class Player {
    int id;
    String name;
    Colour colour;

    public Player(int id, String name, Colour colour) {
        this.id = id;
        this.name = name;
        this.colour = colour;
    }

    public Selected selectPiece(){
        System.out.printf("Select Piece to move(e.i a1,b2,..):");
        char[] input1 = input();

        Selected selected = new Selected(input1[0], Character.getNumericValue(input1[1]));

        return selected;
    }

    public char[] input(){
        String input;
        Scanner scanner = new Scanner(System.in);
        input = scanner.next();
        input = input.toUpperCase();
        char[] input1 = input.toCharArray();
        return input1;
    }

    public Moving movePiece(){
        System.out.printf("Enter Place to move to(e.i a1,b2,..):");
        char[] input1 = input();

        Moving moving = new Moving(input1[0], Character.getNumericValue(input1[1]));
        return moving;
    }

}
