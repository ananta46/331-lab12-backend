package se331.lab.rest.service.interfaces;

import org.springframework.data.domain.Page;
import se331.lab.rest.entity.Event;
import se331.lab.rest.entity.Organizer;

import java.util.List;

public interface OrganizerService {
    List<Organizer> getAllOrganizer();
    Page<Organizer> getOrganizer(Integer page, Integer pageSize);
    Organizer saveOrganizer(Organizer organizer);

}
