package za.ac.cput.school_management.domain;


import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.*;
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Student {
    @Id
    @NotNull
    @Column(name = "studentId", updatable = false,nullable = false, length = 50)
    private String studentId;

    @Column(name = "email", updatable = false,nullable = false, length = 50)
    private String email;
    s
    @Embedded
    private Name name;

}
