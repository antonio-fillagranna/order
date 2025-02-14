package order.app.api.address;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "addresses")
@Entity(name = "addresses")
@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Address {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String street;
    private String number;
    private String postalCode;
    private String neighborhood;
    private String city;
    private String state;
    private String country;
    private String additionalInfo;

    public Address(DTOAddress address) {
        this.street = address.street();
        this.number = address.number();
        this.postalCode = address.postalCode();
        this.neighborhood = address.neighborhood();
        this.city = address.city();
        this.state = address.state();
        this.country = address.country();
        this.additionalInfo = address.additionalInfo();
    }
}
