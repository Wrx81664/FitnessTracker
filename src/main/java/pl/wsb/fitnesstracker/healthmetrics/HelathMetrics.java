package pl.wsb.fitnesstracker.healthmetrics;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;

@Entity
@Table(name = "HealthMetrics")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString

public class HelathMetrics {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Nullable
    private Long id;

    @Column(name = "user_id", nullable = false)
    private Long user_id;

    @Column(name = "date")
    private LocalDate date;

    @Column(name = "weight", nullable = false)
    private Integer weight;

    @Column(name = "height")
    private Integer height;

    @Column(name = "HeartRate")
    private Integer HeartRate;
}
