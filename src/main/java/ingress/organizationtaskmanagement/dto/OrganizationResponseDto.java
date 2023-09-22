package ingress.organizationtaskmanagement.dto;

import lombok.Data;

@Data
public class OrganizationResponseDto {

    private Long id;

    private String name;

    private String surname;

    private String email;

    private String password;
}

