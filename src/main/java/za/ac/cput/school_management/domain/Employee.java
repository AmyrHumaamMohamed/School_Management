package za.ac.cput.school_management.domain;

import com.sun.istack.NotNull;
import lombok.*;
import javax.persistence.*;

@Data
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "EMPLOYEE")
public class Employee {
    @Id
    @NotNull
    @Column(name = "staff_id", unique = true, updatable = false,nullable = false, length =36 )
    private String staffId;
    @Column(name = "email", updatable = false,nullable = false, length = 50)
    private String email;
    @Embedded
    private Name name;
}


