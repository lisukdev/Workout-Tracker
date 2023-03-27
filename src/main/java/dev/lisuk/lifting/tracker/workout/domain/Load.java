package dev.lisuk.lifting.tracker.workout.domain;

import java.util.Optional;

public record Load(
        Optional<TargetLoad> targetLoad,
        Optional<Weight> achievedLoad
){}
