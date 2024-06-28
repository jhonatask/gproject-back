package br.com.jproject.gprojectback.application.dto.resquest;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClienteRequestDTO {
    public String nome;
    public String email;
    public String telefone;
    public String cpforcnpj;
}
