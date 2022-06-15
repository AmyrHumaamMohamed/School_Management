package za.ac.cput.school_management.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Embeddable
public class Address {
    private String unitNumber, complexName, streetNumber, streetName;
    private int postalCode;

    //@Embedded
    //private City city;
}
