package com.example.l3ks1krestapi.DTO.Auth.Request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RegistrationRequest {
    private String username;
    private String email;
    private String password;
    private String identityKey;
    private String signedPrekey;
    private List<String> oneTimePrekeys;
}
