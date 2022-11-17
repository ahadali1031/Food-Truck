/**
* Negative Quantity Exception class for Food Truck.
*
* @author Ahad Ali
* @version 1.0
*/
public class NegativeQuantityException extends RuntimeException {

    /**
    * Constructor that takes in num and inputs message
    * "Quantity" +  num " is not positive.".
    *
    * @param num Number that is inputted.
    */
    public NegativeQuantityException(String num) {
        super("Quantity " + num + " is not positive.");
    }
}