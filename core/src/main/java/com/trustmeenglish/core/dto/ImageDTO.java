package com.trustmeenglish.core.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ImageDTO {
    private Long id;
    private String name;
    private String originalFileName;
    private String contentType;
    private Long size;
    private byte[] bytes;
}
