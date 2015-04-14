package unitConversion;

/**
 * Created by rbansal on 14/04/15.
 */
public class ExtUnit extends Unit implements IUnit {
    //public static ExtUnit EXTENDED = new ExtUnit(UnitCategory.LENGTH) {};

    public ExtUnit(UnitCategory c) {
        super(c);
    }

    @Override
    public double toBaseUnit(double qty) {
        return qty * 1000;
    }

    @Override
    public double fromBaseUnit(double qty) {
        return qty / 1000;
    }

    @Override
    public String toString() {
        return "ext";
    }
}
