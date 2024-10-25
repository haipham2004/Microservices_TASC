CREATE database Test_Microservices;
use Test_Microservices;

CREATE TABLE currency_conversion (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    from_currency VARCHAR(255),
    to_currency VARCHAR(255),
    conversion_multiple DECIMAL(19, 4),
    environment VARCHAR(255)
);

INSERT INTO currency_conversion (from_currency, to_currency, conversion_multiple, environment) VALUES
('USD', 'EUR', 0.85, 'production'),
('EUR', 'GBP', 0.75, 'production'),
('GBP', 'JPY', 150.00, 'development'),
('AUD', 'USD', 0.70, 'testing'),
('CAD', 'INR', 60.00, 'production');


