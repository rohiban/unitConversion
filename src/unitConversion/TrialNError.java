package unitConversion;

/**
 * Created by rbansal on 13/04/15.
 */
public class TrialNError {
    public static void main (String[] args) {
        // create a measurement
        //Measurement temp = new Measurement(32, Unit.Fahrenheit);
        Measurement temp = new Measurement(9, new ExtUnit(UnitCategory.LENGTH));

        // convert to new unit
        try {
            Measurement newTemp = temp.convertTo(Unit.Centimeter);
            System.out.println(newTemp.toString());
        }
        catch (IncompatibleUnitsException e) {
            System.out.println(e.toString());
        }
    }
}
