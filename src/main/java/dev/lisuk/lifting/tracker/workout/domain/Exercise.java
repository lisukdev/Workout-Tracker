package dev.lisuk.lifting.tracker.workout.domain;

import org.springframework.boot.context.properties.bind.DefaultValue;

import java.time.Duration;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public record Exercise(
        UUID id,
        String name,
        String notes,
        Optional<Tempo> tempo,

        List<ExerciseSet> sets,
        Optional<Duration> targetRestTime
) {
}
