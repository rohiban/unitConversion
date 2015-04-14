package unitConversion;

/**
 * Created by rbansal on 13/04/15.
 */
public class Measurement {
    double quantity;
    Unit unit;

    public Measurement(double quantity, Unit unit) {
        this.quantity = quantity;
        this.unit = unit;
    }

    public Measurement convertTo(Unit target) throws IncompatibleUnitsException {
        if (!this.unit.isCompatibleWith(target))
            throw new IncompatibleUnitsException(this.unit, target);
        double qty;

        // do the conversion to base unit
        qty = this.unit.toBaseUnit(this.quantity);

        // do the conversion to new unit
        qty = target.fromBaseUnit(qty);

        return new Measurement(qty, target);
    }

    @Override
    public String toString() {
        return this.quantity + " " + this.unit.toString();
    }
}
