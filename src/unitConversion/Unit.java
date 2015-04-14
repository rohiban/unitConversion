package unitConversion;

import java.rmi.server.UnicastRemoteObject;

/**
 * Created by rbansal on 13/04/15.
 */
public class Unit implements IUnit {
    public static Unit Centimeter = new Unit(UnitCategory.LENGTH) {
        public double toBaseUnit(double qty) {
            return qty;
        }

        public double fromBaseUnit(double qty) {
            return qty;
        }

        @Override
        public String toString() {
            return "cm";
        }
    };
    public static Unit Inch = new Unit(UnitCategory.LENGTH) {
        public double toBaseUnit(double qty) {
            return qty * 2.54;
        }

        public double fromBaseUnit(double qty) {
            return qty/2.54;
        }

        @Override
        public String toString() {
            return "inch";
        }
    };
    public static Unit Celsius = new Unit(UnitCategory.TEMPERATURE) {
        public double toBaseUnit(double qty) {
            return qty;
        }

        public double fromBaseUnit(double qty) {
            return qty;
        }

        @Override
        public String toString() {
            return "~C";
        }
    };
    public static Unit Fahrenheit = new Unit(UnitCategory.TEMPERATURE) {
        public double toBaseUnit(double qty) {
            return (qty - 32) * 5 / 9;
        }

        public double fromBaseUnit(double qty) {
            return (qty * 9 / 5) + 32;
        }

        @Override
        public String toString() {
            return "~F";
        }
    };
    public static Unit Kelvin = new Unit(UnitCategory.TEMPERATURE) {
        public double toBaseUnit(double qty) {
            return qty + 273;
        }

        public double fromBaseUnit(double qty) {
            return qty - 273;
        }

        @Override
        public String toString() {
            return "~K";
        }
    };
    public static Unit Kilogram = new Unit(UnitCategory.WEIGHT) {
        public double toBaseUnit(double qty) {
            return qty;
        }

        public double fromBaseUnit(double qty) {
            return qty;
        }

        @Override
        public String toString() {
            return "kg";
        }
    };
    public static Unit Pound = new Unit(UnitCategory.WEIGHT) {
        public double toBaseUnit(double qty) {
            return 0.453592 * qty;
        }

        public double fromBaseUnit(double qty) {
            return qty / 0.453592;
        }

        @Override
        public String toString() {
            return "lbs";
        }
    };

    UnitCategory category;

    public Unit (UnitCategory category) {
        this.category = category;
    }

    public double toBaseUnit(double qty) { return qty;}

    public double fromBaseUnit(double qty){ return qty;}

    public boolean isCompatibleWith(Unit other) {
        return (other.category == this.category);
    }

//    @Override
//    public boolean equals(Object o) {
//        Unit other = (Unit)o;
//        return (this.category == other.category);
//    }
}
