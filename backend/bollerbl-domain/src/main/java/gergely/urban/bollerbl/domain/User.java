package gergely.urban.bollerbl.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Transient;

@Entity
@Getter
@Setter
public class User {
    @Id
    private String userName;
    private String name;
    private String passWord;
    @Transient
    private String passwordConfirm;
    @ManyToMany
    private List<Role> roles=new ArrayList<>();
}
