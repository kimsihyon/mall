package mall.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import mall.domain.*;
import mall.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class UserNotified extends AbstractEvent {

    private Long id;
    private String itemId;
    private Integer qty;
    private String address;
    private String customerId;
    private String status;
    private String message;

    public UserNotified(Order aggregate) {
        super(aggregate);
    }

    public UserNotified() {
        super();
    }
}
//>>> DDD / Domain Event
