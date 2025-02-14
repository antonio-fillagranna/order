package order.app.api.address;

public record DTOAddress(String street, String number, String postalCode, String neighborhood, String city, String state, String country, String additionalInfo) {
}
