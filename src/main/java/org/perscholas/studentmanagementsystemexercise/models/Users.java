package org.perscholas.studentmanagementsystemexercise.models;

import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
@Getter
@Setter
@ToString(onlyExplicitlyIncluded = true)
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
@Slf4j
public class Users implements Serializable {

//    @Id
//    @NotNull
//    @NonNull
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @ToString.Include
//    Long stuId;

    @NotNull
    @NonNull
    @ToString.Include
    @NotBlank(message = "Please enter a name!")
    String name;

    @Id
    @NotNull
    @NonNull
    @ToString.Include
    @NotBlank(message = "Please enter a valid email!") // TODO: delete this and replace with the @Email below
//    @Email(message = "Please enter a valid email!")
    String email;

    @NotNull
    @NonNull
    @ToString.Include
    @NotBlank(message = "Please enter a password!")
    String password;

    @OneToMany(cascade = CascadeType.ALL)
    List<Courses> courses;
    //add Equals and Hashcode methods manually

    public boolean equals(Users user) {
        if (this.toString() == user.toString()) {
            return true;
        }
        else
        {
            return false;
        }
    }

}
