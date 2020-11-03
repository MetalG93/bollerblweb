package gergely.urban.bollerbl.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Guest {
    @Id
    private String name;
    private String phone;
    private String email;
    private boolean come;
}
