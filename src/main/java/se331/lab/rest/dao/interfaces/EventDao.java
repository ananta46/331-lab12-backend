package se331.lab.rest.dao.interfaces;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import se331.lab.rest.entity.Event;

public interface EventDao {
    Integer getEventSize();
    Page<Event> getEvents(Integer pageSize, Integer page);
    Event getEventById(Long id);
    Event saveEvent(Event event);
    Page<Event> getEvents(String name, Pageable page);
}
