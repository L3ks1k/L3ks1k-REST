package com.example.l3ks1krestapi.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class RevokedToken {
    @Id
    @GeneratedValue
    private Integer id;
    private String revokedTokenHash;
}
