package ingress.organizationtaskmanagement.controller;

import ingress.organizationtaskmanagement.dto.OrganizationRequestDto;
import ingress.organizationtaskmanagement.dto.OrganizationResponseDto;
import ingress.organizationtaskmanagement.service.OrganizationServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/api/organization")
@RequiredArgsConstructor
public class OrganizationController {

    private final OrganizationServiceImpl organizationServiceimpl;
    @GetMapping
    public List<OrganizationResponseDto> findAll() {return organizationServiceimpl.findAll();}
    @PostMapping
    public void create(@RequestBody OrganizationRequestDto organizationRequestDto){organizationServiceimpl.createOrganization(organizationRequestDto);}
    @GetMapping("/{id}")
    public OrganizationResponseDto getOrganizationById(@PathVariable Long id){
        return organizationServiceimpl.getOrganizationById(id);
    }
    @PutMapping("/{id}")
    public void update(@PathVariable Long id, @RequestBody OrganizationRequestDto organizationRequestDto){
        organizationServiceimpl.update(id,organizationRequestDto);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){ organizationServiceimpl.delete(id);}

    }




