package za.ac.cput.school_management.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class EmployeeAddress {
    @Id
    private String staffId;

    @Embedded
    private Address address;
}
