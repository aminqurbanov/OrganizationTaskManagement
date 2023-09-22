package ingress.organizationtaskmanagement.service;

import ingress.organizationtaskmanagement.dto.OrganizationRequestDto;
import ingress.organizationtaskmanagement.dto.OrganizationResponseDto;
import ingress.organizationtaskmanagement.entity.Organization;
import ingress.organizationtaskmanagement.repository.OrganizationRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
@Service
@RequiredArgsConstructor
public class OrganizationService implements OrganizationServiceImpl{


    private final ModelMapper modelMapper;
    private final OrganizationRepository organizationRepository;
    @Override
    public List<OrganizationResponseDto> findAll(){
        return organizationRepository
                .findAll()
                .stream()
                .map(organization -> modelMapper.map(organization, OrganizationResponseDto.class))
                .collect(Collectors.toList());
    }
    @Override
    public void createOrganization(OrganizationRequestDto organizationRequestDto) {
        Organization organization = modelMapper.map(organizationRequestDto,Organization.class);
        organizationRepository.save(organization);
    }
    @Override
    public OrganizationResponseDto getOrganizationById(Long id) {
        Organization organization = organizationRepository.findById(id).orElseThrow(() -> new RuntimeException());
        return modelMapper.map(organization, OrganizationResponseDto.class);
    }
    @Override
    public void update(Long id, OrganizationRequestDto organizationRequestDto) {
        Organization organization = modelMapper.map(organizationRequestDto, Organization.class);
        organizationRepository.save(organization);
    }
    @Override
    public void delete(Long id) {
    organizationRepository.deleteById(id);
    }
}