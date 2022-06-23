package com.trustmeenglish.core.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CardDTO {
    private Long id;
    private EnWordDTO enWordDTO;
    private RuWordDTO ruWordDTO;
    private ImageDTO image;
    private Long rating;
}
