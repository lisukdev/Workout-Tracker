package dev.lisuk.lifting.tracker.workout;

import dev.lisuk.lifting.tracker.workout.domain.Workout;
import org.springframework.stereotype.Repository;

import java.util.UUID;

public interface WorkoutRepository {
    Workout createWorkout(Workout workout);
    Workout getWorkout(UUID workoutId);
    Workout updateWorkout(UUID workoutId, Workout workout);
}
