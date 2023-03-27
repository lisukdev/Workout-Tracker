package dev.lisuk.lifting.tracker.workout;

import dev.lisuk.lifting.tracker.workout.domain.Workout;
import org.springframework.stereotype.Repository;

import java.time.Instant;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

@Repository
public class InMemoryWorkoutRepository implements WorkoutRepository {
    private final Map<UUID, Workout> workouts = new ConcurrentHashMap<>();

    @Override
    public Workout createWorkout(Workout workout) {
        UUID id = UUID.randomUUID();
        Instant now = Instant.now();
        Workout createdWorkout = new Workout(
                id, workout.name(), workout.notes(), workout.exercises(),
                now, now, workout.startTime(), Optional.empty());
        workouts.put(id, createdWorkout);
        return createdWorkout;
    }

    @Override
    public Workout getWorkout(UUID workoutId) {
        return workouts.get(workoutId);
    }

    @Override
    public Workout updateWorkout(UUID workoutId, Workout workout) {
        return workouts.computeIfPresent(workoutId, (id, w) -> new Workout(
                id, workout.name(), workout.notes(), workout.exercises(),
                w.creationTime(), Instant.now(), workout.startTime(), workout.endTime()));
    }
}
