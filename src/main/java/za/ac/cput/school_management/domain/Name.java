package za.ac.cput.school_management.domain;

import com.sun.istack.NotNull;
import lombok.*;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;

import javax.persistence.Embeddable;
import java.util.Objects;

@Embeddable
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Name {
    private String firstName, middleName, lastName;
}
