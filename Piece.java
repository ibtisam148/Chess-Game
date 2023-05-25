/*
This class represents an abstract class named "Piece" that 
serves as a base class for different types of chess pieces.
The class also has a constructor that takes a Colour parameter. 
The constructor initializes the colour member variable with the provided color value.
*/
abstract public class Piece {
    Colour colour;
    char name = '-';

    public Piece(Colour colour) {
        this.colour = colour;
    }

/*
This method defines the behavior for movement validation of chess pieces. 
It is declared as abstract, which means it does not provide an implementation 
in this class but must be implemented by any concrete subclass extending the Piece class.
*/
    public abstract boolean MovementValidation(Selected selected, Moving moving, Moving[] list, Piece board[][]);
}
