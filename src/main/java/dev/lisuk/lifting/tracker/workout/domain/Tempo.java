package dev.lisuk.lifting.tracker.workout.domain;

import java.util.OptionalInt;

/**
 * Specifies the time in seconds for each phase of the exercise.
 * The time of each phase must be 0 or positive with a zero indicating as fast as possible.
 * @param targetEccentricSeconds
 * @param targetPauseSeconds
 * @param targetConcentricSeconds
 * @param targetRestSeconds
 */
public record Tempo(
        int targetEccentricSeconds,
        int targetPauseSeconds,
        int targetConcentricSeconds,
        int targetRestSeconds
) {
}
