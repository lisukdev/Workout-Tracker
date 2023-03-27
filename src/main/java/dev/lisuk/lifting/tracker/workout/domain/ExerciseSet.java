package dev.lisuk.lifting.tracker.workout.domain;

import java.time.Instant;
import java.util.Optional;
import java.util.UUID;

public record ExerciseSet(
        UUID id,
        Optional<Reps> reps,
        Optional<Load> load,

        Optional<Instant> completedAt
) {
}
