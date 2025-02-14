package order.app.api.client;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import order.app.api.address.Address;

@Table(name = "clients")
@Entity(name = "clients")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Client {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String cell;
    private String email;
    private String doc;

    @Embedded
    private Address address;

    public Client(DTOClientRegistry data) {
        this.name = data.name();
        this.cell = data.cell();
        this.email = data.email();
        this.doc = data.doc();
        this.address = new Address(data.address());
    }
}
