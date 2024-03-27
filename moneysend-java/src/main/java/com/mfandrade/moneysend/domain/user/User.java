package com.mfandrade.moneysend.domain.user;

import jakarta.persistence.*;
import lombok.*;

@Entity(name="users")
@Table(name="users")
@Getter
@Setter
@EqualsAndHashCode(of="id")
@NoArgsConstructor
@AllArgsConstructor
public class User {

  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  private Long id;
  private String name;
  @Column(unique=true)
  private String documentId;
  @Column(unique=true)
  private String email; 
  private String password;
  private UserType userType;
  private Double balance;
}
