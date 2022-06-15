package za.ac.cput.school_management.domain;
/**
 *
 * Humaam Mohamed
 * 214044750
 * Country Entity.
 *
 */
public class Country {

    private String id;
    private String name;

    private Country (CountryBuilder builder){

        this.id=builder.id;
        this.name=builder.name;

    }

    public String setId(String id) {
        this.id = id;
        return id;
    }

    public String setName(String name) {
        this.name = name;
        return name;
    }

    @Override
    public String toString() {
        return "Country{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

   public static class CountryBuilder{

        private String id;
        private String name;

       public CountryBuilder setId(String id) {
           this.id = id;
           return this;
       }

       public CountryBuilder setName(String name) {
           this.name = name;
           return this;
       }


       public Country builder(){

           return new Country(this);
       }
   }




}
