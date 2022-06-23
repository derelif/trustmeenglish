package com.trustmeenglish.core.mappers;


import com.trustmeenglish.core.dto.CardDTO;
import com.trustmeenglish.core.model.Card;
import org.mapstruct.Mapper;

import java.io.IOException;

@Mapper
public interface CardMapper {
    CardDTO toDTO(Card card) throws IOException;
    Card toEntity(CardDTO cardDTO) throws IOException;
}
