package dev.lisuk.lifting.tracker.workout;

import dev.lisuk.lifting.tracker.workout.domain.Exercise;
import dev.lisuk.lifting.tracker.workout.domain.ExerciseSet;
import dev.lisuk.lifting.tracker.workout.domain.Workout;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.UUID;

@Service
public class WorkoutService {
    private final WorkoutRepository workoutRepository;

    public WorkoutService(WorkoutRepository workoutRepository) {
        this.workoutRepository = workoutRepository;
    }

    public Workout createWorkout(Workout workout) {
        return workoutRepository.createWorkout(workout);
    }

    public Workout getWorkout(UUID workoutId) {
        return workoutRepository.getWorkout(workoutId);
    }

    public Workout updateWorkout(UUID workoutId, Workout workout) {
        return workoutRepository.updateWorkout(workoutId, workout);
    }
}