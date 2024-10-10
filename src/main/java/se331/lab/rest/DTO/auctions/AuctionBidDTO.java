package se331.lab.rest.DTO.auctions;


import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class AuctionBidDTO {
    Long id;
    BigDecimal amount;
    String dateTime;
}