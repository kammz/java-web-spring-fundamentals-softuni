package org.boneva.mobilele.model.dto;

import org.boneva.mobilele.model.enums.EngineEnum;
import org.boneva.mobilele.model.enums.TransmissionEnum;

public record CreateOfferDTO(String description, Long modelId, EngineEnum engine, TransmissionEnum transmission,
                             String imageUrl, Integer mileage, Integer price, Integer year) {
}