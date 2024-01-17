package org.boneva.mobilele.service.impl;

import org.boneva.mobilele.model.dto.CreateOfferDTO;
import org.boneva.mobilele.repository.OfferRepository;
import org.boneva.mobilele.service.OfferService;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class OfferServiceImpl implements OfferService {

    private final OfferRepository offerRepository;

    public OfferServiceImpl(OfferRepository offerRepository) {
        this.offerRepository = offerRepository;
    }

    @Override
    public UUID createOffer(CreateOfferDTO createOfferDTO) {
        //TODO - create offer
        throw new UnsupportedOperationException("Coming soon!");
    }
}
