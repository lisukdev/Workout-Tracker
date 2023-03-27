package dev.lisuk.lifting.tracker.workout.domain;

import jdk.jfr.Percentage;

import java.util.Optional;
import java.util.OptionalDouble;

public record TargetLoad(
        LoadScheme scheme,
        OptionalDouble percentage,
        OptionalDouble rpe,
        Optional<Weight> weight
) {
    public enum LoadScheme {
        PERCENTAGE,
        RPE,
        WEIGHT,
    }
}
