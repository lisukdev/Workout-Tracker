package dev.lisuk.lifting.tracker.workout.domain;

public record Weight(double value, Unit unit){
    public enum Unit{
        KG,
        LB
    }

    /**
     * Convert weight unit to kg as all internal calculations are done in kg.
     * @return Weight in kg
     */
    public double toKg(){
        return switch (unit){
            case KG -> value;
            case LB -> value * 0.45359237;
        };
    }
}
