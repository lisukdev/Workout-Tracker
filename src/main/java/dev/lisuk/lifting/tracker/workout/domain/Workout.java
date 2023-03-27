package dev.lisuk.lifting.tracker.workout.domain;

import java.time.Instant;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public record Workout(
        UUID id,
        String name,
        String notes,
        List<Exercise> exercises,
        Instant creationTime,
        Instant lastModifiedTime,
        Optional<Instant> startTime,
        Optional<Instant> endTime
) {
}
