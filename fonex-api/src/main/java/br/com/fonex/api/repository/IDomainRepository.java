package br.com.fonex.api.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.fonex.api.model.Domain;
import br.com.fonex.api.model.License;

@Repository
public interface IDomainRepository {
	
	List<Domain> findAll();
	
	List<Domain> findBySquad(boolean enable);

	List<License> findPackageAvailableBy(String domainId);

	List<License> findPackageBy(String domainId);
	
}
