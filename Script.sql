CREATE TABLE addresses (
    id SERIAL PRIMARY KEY,
    street VARCHAR(255) NOT NULL,
    number VARCHAR(10) NOT NULL,
    postalCode VARCHAR(20) NOT NULL,
    neighborhood VARCHAR(100),
    city VARCHAR(20) NOT NULL,
    state VARCHAR(50) NOT NULL,
    country VARCHAR(50) NOT NULL,
    additionalInfo VARCHAR(255)
);
CREATE TABLE clients (
    id SERIAL PRIMARY KEY,
    name VARCHAR(100),
    cell VARCHAR(20),
    email VARCHAR(255),
    doc VARCHAR(20)
);
CREATE TABLE sushis (
    id SERIAL PRIMARY KEY,
    name VARCHAR(20) NOT NULL ,
    cost DECIMAL(10,2) NOT NULL,
    description VARCHAR(255),
    category VARCHAR(20),
    available BOOLEAN
);
CREATE TABLE orders (
    id SERIAL PRIMARY KEY,
    client_id INT NOT NULL,
    date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    total DECIMAL(10,2) NOT NULL,
    FOREIGN KEY (client_id) REFERENCES clients(id)
);
CREATE TABLE  order_items (
    id SERIAL PRIMARY KEY,
    order_id INT NOT NULL,
    FOREIGN KEY (order_id) REFERENCES orders(id)
);
CREATE TABLE order_sushis (
    id SERIAL PRIMARY KEY,
    sushi_id INT NOT NULL,
    quantity INT NOT NULL,
    FOREIGN KEY ()
);