package se331.lab.rest.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import se331.lab.rest.entity.Bid;
import se331.lab.rest.service.interfaces.BidService;
import se331.lab.rest.util.LabMapper;

@RestController
@RequiredArgsConstructor
public class BidController {
    final BidService bidService;

    @GetMapping("/bids")
    ResponseEntity<?> getBids() {
        return ResponseEntity.ok(LabMapper.INSTANCE.getBidDTO(bidService.getBids()));
    }
}
