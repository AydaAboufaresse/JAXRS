package com.example.web_services.entities;

import com.example.web_services.enumeration.TypeCompte;
import jakarta.persistence.*;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.*;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@XmlRootElement

public class Compte {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double solde;
    @Temporal(TemporalType.DATE)
    private Date dateCreation;
    @Enumerated(EnumType.ORDINAL)
    private TypeCompte type;

}
