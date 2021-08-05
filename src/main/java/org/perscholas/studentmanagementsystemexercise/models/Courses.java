package org.perscholas.studentmanagementsystemexercise.models;

import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;



@Entity
@Getter
@Setter
@ToString(onlyExplicitlyIncluded = true)
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Slf4j

public class Courses {

    @Id
    @NotNull
    @NonNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ToString.Include
    Integer cid;

    @NotNull
    @NonNull
    @ToString.Include
    String cName;


    @NotNull
    @ToString.Include
    String cInstructorName;

}
