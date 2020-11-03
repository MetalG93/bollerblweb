package gergely.urban.bollerbl.domain;

import lombok.Getter;
import lombok.Setter;

import java.time.Duration;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Artist {
    @Id
    private String name;
    private String contactName;
    private String contact_phone;
    private String contact_mail;
    private int fee;
    private LocalDateTime begin;
    private LocalDateTime end;
    private Duration length;
}
