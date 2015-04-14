package unitConversion;

/**
 * Created by rbansal on 13/04/15.
 */
public class IncompatibleUnitsException extends Exception {
    Unit from;
    Unit to;

    public IncompatibleUnitsException (Unit u1, Unit u2) {
        this.from = u1;
        this.to = u2;
    }

    @Override
    public String toString() {
        return "Exception : Conversion between incompatible units - " + this.from.toString() + " and " + this.to.toString();
    }
}
