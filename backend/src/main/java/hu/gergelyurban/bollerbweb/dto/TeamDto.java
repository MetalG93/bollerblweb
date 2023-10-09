package hu.gergelyurban.bollerbweb.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class TeamDto {
    private int id;
    private String name;
    private LocalDateTime registrationTime;
}