package ingress.organizationtaskmanagement.service;

import ingress.organizationtaskmanagement.dto.OrganizationRequestDto;
import ingress.organizationtaskmanagement.dto.OrganizationResponseDto;
import java.util.List;
public interface OrganizationServiceImpl {
    void createOrganization(OrganizationRequestDto organizationRequestDto);
    OrganizationResponseDto getOrganizationById(Long id);
    List<OrganizationResponseDto> findAll();
    void update(Long id, OrganizationRequestDto organizationRequest);
    void delete(Long id);
}
