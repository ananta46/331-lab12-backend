package se331.lab.rest.service.interfaces;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import se331.lab.rest.entity.Event;

public interface EventService {
    Integer getEventSize();
    Page<Event> getEvents(Integer pageSize, Integer page);
    Event getEventById(Long id);
    Event save(Event event);
    Page<Event> getEvents(String name, Pageable pageable);
}
