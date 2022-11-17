/**
* Illegal Quantity Exception class for Food Truck.
*
* @author Ahad Ali
* @version 1.0
*/
public class IllegalQuantityException extends Exception {

    /**
    * Constructor that takes in num and inputs message
    * "Quantity num is not a number.".
    *
    * @param num String that is inputted.
    */
    public IllegalQuantityException(String num) {
        super("Quantity " + num + " is not a number.");
    }
}