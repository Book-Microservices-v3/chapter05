package microservices.book.multiplication.user;

import lombok.*;
import jakarta.persistence.*;
/**
* Stores information to identify the user.
*/
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Users {
 @Id
 @GeneratedValue
 private Long id;
 private String alias;
 public Users(final String userAlias) {
 this(null, userAlias);
 }
}

