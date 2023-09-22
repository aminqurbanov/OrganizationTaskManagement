package ingress.organizationtaskmanagement.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.time.LocalDate;
@Entity
@Data
@Table(name = "tasks")
@RequiredArgsConstructor
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    Enum<Status>statusEnum;

    private LocalDate deadline;

    private String description;
}
