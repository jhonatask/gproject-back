package br.com.jproject.gprojectback.application.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClienteResponseDTO {
    private UUID id;
    private String nome;
    private String email;
    private String telefone;
    private String cpforcnpj;
}
