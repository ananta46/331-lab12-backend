package se331.lab.rest.util;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import se331.lab.rest.DTO.auctions.AuctionDTO;
import se331.lab.rest.DTO.auctions.BidDTO;
import se331.lab.rest.DTO.events.EventDTO;
import se331.lab.rest.DTO.events.EventParticipantDTO;
import se331.lab.rest.DTO.events.OrganizerDTO;
import se331.lab.rest.DTO.events.ParticipantDTO;
import se331.lab.rest.entity.*;

import java.util.List;

@Mapper
public interface LabMapper {
    LabMapper INSTANCE = Mappers.getMapper(LabMapper.class);

    EventDTO getEventDTO(Event event);
    List<EventDTO> getEventDTO(List<Event> events);

    OrganizerDTO getOrganizerDTO(Organizer organizer);
    List<OrganizerDTO> getOrganizerDTO(List<Organizer> organizers);

    ParticipantDTO getParticipantDTO(Participant participant);
    List<ParticipantDTO> getParticipantDTO(List<Participant> participants);

    EventParticipantDTO getEventParticipantDTO(Participant participant);
    List<EventParticipantDTO> getEventParticipantDTO(List<Participant> participants);

    AuctionDTO getAuctionDTO(Auction auction);
    List<AuctionDTO> getAuctionDTO(List<Auction> auction);

    BidDTO getBidDTO(Bid bid);
    List<BidDTO> getBidDTO(List<Bid> bids);
}