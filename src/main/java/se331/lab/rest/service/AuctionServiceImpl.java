package se331.lab.rest.service;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import se331.lab.rest.dao.interfaces.AuctionDao;
import se331.lab.rest.entity.Auction;
import se331.lab.rest.service.interfaces.AuctionService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AuctionServiceImpl implements AuctionService {

    final AuctionDao auctionDao;

    @Override
    public List<Auction> getAllAuctions() {
        return auctionDao.getAllAuctions();
    }

    @Override
    public Page<Auction> getAllAuctions(Integer pageSize, Integer page) {
        return auctionDao.getAllAuctions(pageSize, page);
    }

    @Override
    public Auction getAuctionById(Long id) {
        return auctionDao.getAuctionById(id);
    }

    @Override
    public Page<Auction> getAuctionsByTitle(String title, Pageable page) {
        return auctionDao.getAuctionsByTitle(title, page);
    }

    @Override
    public Page<Auction> getAuctionsByDescription(String description, Pageable page) {
        return auctionDao.getAuctionsByDescription(description, page);
    }

    @Override
    public Page<Auction> getAuctionsByTitleOrDescription(String title, String description, Pageable page) {
        return auctionDao.getAuctionsByTitleOrDescription(title, description, page);
    }

    @Override
    public Page<Auction> getAuctionsByType(String type, Pageable page) {
        return auctionDao.getAuctionsByType(type, page); // Implemented in DAO
    }

    @Override
    public Auction saveAuction(Auction auction) {
        return auctionDao.saveAuction(auction);
    }
}
