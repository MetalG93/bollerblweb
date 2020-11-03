package gergely.urban.bollerbl.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Team {
    @Id
    private String name;
    private String leader;
    private String phone;
    private String email;
    private String address;
    private String plateNumber;
    private int number;
    private int gardenNumber;
    private boolean paid;
    private boolean entryPermissionSent;
}
