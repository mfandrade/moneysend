package com.mfandrade.moneysend.domain.transaction;

import com.mfandrade.moneysend.domain.user.User;
import java.time.LocalDateTime;
import jakarta.persistence.*;
import lombok.*;

@Entity(name = "transactions")
@Table(name = "transactions")
@Getter
@Setter
@EqualsAndHashCode(of = "id")
@NoArgsConstructor
@AllArgsConstructor
public class Transaction {

  @Id
  @GeneratedValue(strategy = GeneratedType.IDENTITY)
  private Long id;
  private Double value;
  private LocalDateTime timestamp;
  @ManyToOne
  @JoinColumn(name = "sender_id")
  private User sender;
  @ManyToOne
  @JoinColumn(name = "receiver_id")
  private User receiver;
}
