package gergely.urban.bollerbl.controller;

import gergely.urban.bollerbl.domain.Box;
import gergely.urban.bollerbl.domain.TicketType;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.List;

@RestController
public class TicketController {

    public int calculatePrice(List<Box> boxes){
        int fullPrice=0;

        for (Box box : boxes) {
            int price=0;
            if(box.getTicketType()== TicketType.CHILD){
                price = 400;
            } else {
                price = 600;
            }
            fullPrice +=(box.getEnd().subtract(box.getBegin())).multiply(BigDecimal.valueOf(price)).intValue();
        }

        return fullPrice;
    }
}
