package pl.wsb.fitnesstracker.statistics.api;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import pl.wsb.fitnesstracker.user.api.User;

@Entity
@Table(name = "statistics")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString

public class Statistics {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Nullable
    private Long id;

    @OneToOne
    @JoinColumn(name = "user_id", nullable = false, unique = true)
    private User user_id;

    @Column(name = "total_trainings", nullable = false)
    private Integer total_trainings;

    @Column(name = "total_distance", nullable = false)
    private Double total_distance;

    @Column(name = "total_calories_burned", nullable = false)
    private Integer total_calories_burned;

    public Statistics(final User user_id,
                      final Integer total_trainings,
                      final Double total_distance,
                      final Integer total_calories_burned) {
        this.user_id = user_id;
        this.total_trainings = total_trainings;
        this.total_distance = total_distance;
        this.total_calories_burned = total_calories_burned;
    }
}