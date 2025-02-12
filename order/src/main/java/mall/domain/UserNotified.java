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

    public UserNotified(Order aggregate) {
        super(aggregate);
    }

    public UserNotified() {
        super();
    }
}
//>>> DDD / Domain Event
