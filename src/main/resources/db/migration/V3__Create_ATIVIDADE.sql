CREATE EXTENSION IF NOT EXISTS "pgcrypto";

CREATE TABLE atividade (
        id UUID DEFAULT gen_random_uuid() PRIMARY KEY,
        descricao VARCHAR(255) NOT NULL,
        status VARCHAR(255) NOT NULL,
        projeto_id UUID NOT NULL,
        CONSTRAINT fk_projeto FOREIGN KEY (projeto_id) REFERENCES Projeto(id)
);