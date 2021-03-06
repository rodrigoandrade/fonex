package br.com.fonex.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fonex.api.model.Domain;
import br.com.fonex.api.model.License;
import br.com.fonex.api.repository.IDomainRepository;

@Service
public class DomainService {
	
	@Autowired
	IDomainRepository repository;
	
	public List<Domain> list() {
		return repository.findAll();
	}
	
	public List<Domain> listBySquad(boolean enable) {
		return repository.findBySquad(enable);
	}

	public List<License> listPackageAvailable(String domainId) {
		return repository.findPackageAvailableBy(domainId);
	}

	public List<License> listPackage(String domainId) {
		return repository.findPackageBy(domainId);
	}
	
}
