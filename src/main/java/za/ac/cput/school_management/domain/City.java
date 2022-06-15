package za.ac.cput.school_management.domain;

/**
 *
 * Moegamad Nur Duncan
 * 220014442
 * City Entity
 *
 */

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor


public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @GenericGenerator(name = "system-uuid",strategy = "uuid")

    @Column(name = "cityId", updatable = false,nullable = false, length = 50)
    private String cityId;

    @Column(name = "cityName", updatable = false,nullable = false, length = 50)
    private String cityName;

    @Embedded
    private Country country;


    private City(Builder builder){
        this.cityId = builder.cityId;
        this.cityName = builder.cityName;
        this.country = builder.country;
    }

    public static class Builder{
        private String cityId, cityName;
        private Country country;

        public Builder cityId(String cityId){
            this.cityId = cityId;
            return this;
        }

        public Builder cityName(String cityName){
            this.cityName = cityName;
            return this;
        }

        public Builder country(Country country){
            this.country = country;
            return this;
        }

        public City build(){


            return new City(this);
        }
    }
}
