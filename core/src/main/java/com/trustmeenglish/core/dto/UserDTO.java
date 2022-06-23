package com.trustmeenglish.core.dto;


import lombok.*;

import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {
    private Long id;
    private String email;
    private Set<RoleDTO> roles;
}
