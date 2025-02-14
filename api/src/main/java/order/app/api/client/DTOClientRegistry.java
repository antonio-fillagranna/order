package order.app.api.client;

import order.app.api.address.DTOAddress;

public record DTOClientRegistry(String name, String cell, String email, String doc, DTOAddress address) {
}
