CREATE EXTENSION IF NOT EXISTS "pgcrypto";

CREATE TABLE Projeto (
        id UUID DEFAULT gen_random_uuid() PRIMARY KEY,
        nome VARCHAR(255) NOT NULL,
        descricao VARCHAR(255),
        status VARCHAR(255) NOT NULL,
        cliente_id UUID NOT NULL,
        CONSTRAINT fk_cliente FOREIGN KEY (cliente_id) REFERENCES Cliente(id)
);