package br.com.fonex.api.controller;

import static java.util.Objects.nonNull;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.fonex.api.model.Domain;
import br.com.fonex.api.model.License;
import br.com.fonex.api.service.DomainService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;


@Api(value = "fonex-api")
@RestController
@RequestMapping("/domains")
public class DomainController {

	@Autowired
	DomainService service;
	
	@GetMapping
	@ApiOperation(value = "Domain List", response = List.class)
	public List<Domain> list(@RequestParam(value = "squad", required = false) Boolean squad) {

		if (nonNull(squad)) {
			return service.listBySquad(squad);			
		} else {
			return service.list();
		}
	}
	
	@GetMapping(path = "licensePackage/available")
	public List<License> listLicensePackageAvailable(@PathParam(value = "domainId") String domainId) {
		return service.listPackageAvailable(domainId);
	}
	
	@GetMapping(path = "licensePackage")
	public List<License> listPackage(@PathParam(value = "domainId") String domainId) {
		return service.listPackage(domainId);
	}
}
