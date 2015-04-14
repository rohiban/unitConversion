package unitConversion;

/**
 * Created by rbansal on 14/04/15.
 */
public interface IUnit {
    public double toBaseUnit(double qty);
    public double fromBaseUnit(double qty);
    //public boolean isCompatibleWith(IUnit other);
}
