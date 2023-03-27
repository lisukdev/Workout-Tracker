package dev.lisuk.lifting.tracker.workout.domain;

import java.util.OptionalInt;

public record Reps(
        OptionalInt targetRepsLowerBound,
        OptionalInt targetRepsUpperBound,
        boolean asManyAsPossible,
        OptionalInt achievedReps
) {
}
