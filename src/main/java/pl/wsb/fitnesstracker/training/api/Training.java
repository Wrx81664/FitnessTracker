package pl.wsb.fitnesstracker.training.api;

import lombok.Getter;
import pl.wsb.fitnesstracker.training.internal.ActivityType;
import pl.wsb.fitnesstracker.user.api.User;
import lombok.NoArgsConstructor;
import jakarta.persistence.*;
import lombok.AccessLevel;

import java.util.Date;

@Getter
@Entity
@Table(name = "trainings")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Training {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user_id;

    @Column(name = "start_time", nullable = false)
    private Date start_time;

    @Column(name = "end_time", nullable = false)
    private Date end_time;

    @Enumerated(EnumType.STRING)
    @Column(name = "activity_type", nullable = false)
    private ActivityType activity_type;

    @Column(name = "distance")
    private Double distance;

    @Column(name = "average_speed")
    private Double average_speed;

    public Training(
            final User user_id,
            final Date start_time,
            final Date end_time,
            final ActivityType activity_type,
            final Double distance,
            final Double average_speed) {
        this.user_id = user_id;
        this.start_time = start_time;
        this.end_time = end_time;
        this.activity_type = activity_type;
        this.distance = distance;
        this.average_speed = average_speed;
    }
}