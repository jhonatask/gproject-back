CREATE EXTENSION IF NOT EXISTS "pgcrypto";

CREATE TABLE Cliente (
        id UUID DEFAULT gen_random_uuid() PRIMARY KEY,
        nome VARCHAR(255) NOT NULL,
        email VARCHAR(255) NOT NULL,
        telefone VARCHAR(255) NOT NULL,
        cpforcnpj VARCHAR(100) NOT NULL
);