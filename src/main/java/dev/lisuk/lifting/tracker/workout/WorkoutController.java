package dev.lisuk.lifting.tracker.workout;

import dev.lisuk.lifting.tracker.workout.domain.Exercise;
import dev.lisuk.lifting.tracker.workout.domain.ExerciseSet;
import dev.lisuk.lifting.tracker.workout.domain.Workout;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/workouts")
public class WorkoutController {
    private final WorkoutService workoutService;

    public WorkoutController(WorkoutService workoutService) {
        this.workoutService = workoutService;
    }

    @PostMapping
    public Workout createWorkout(@RequestBody Workout workout) {
        return workoutService.createWorkout(workout);
    }

    @GetMapping("{workoutId}")
    public Workout getWorkout(@PathVariable UUID workoutId) {
        return workoutService.getWorkout(workoutId);
    }

    @PutMapping("{workoutId}")
    public Workout updateWorkout(@PathVariable UUID workoutId, @RequestBody Workout workout) {
        return workoutService.updateWorkout(workoutId, workout);
    }
}
