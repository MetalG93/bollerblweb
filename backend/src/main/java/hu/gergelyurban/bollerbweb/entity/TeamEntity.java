package hu.gergelyurban.bollerbweb.entity;

import hu.gergelyurban.bollerbweb.dto.TeamDto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "team")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TeamEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private LocalDateTime registrationTime;

    public TeamDto getDto() {
        return TeamDto.builder()
        .id(id)
        .name(name)
        .registrationTime(registrationTime)
        .build();
    }
}