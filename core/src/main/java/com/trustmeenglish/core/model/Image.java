package com.trustmeenglish.core.model;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "images", schema = "trustmeenglish")
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = {"id"})
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Column(name = "original_filename")
    private String originalFileName;
    @Column(name = "content_type")
    private String contentType;
    private Long size;
    @Lob
    @Column(name = "bytes")
    private byte[] bytes;
}
