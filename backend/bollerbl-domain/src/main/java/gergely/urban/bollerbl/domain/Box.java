package gergely.urban.bollerbl.domain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Box {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    private BigDecimal begin;
    private BigDecimal end;
    private TicketType ticketType;
}
