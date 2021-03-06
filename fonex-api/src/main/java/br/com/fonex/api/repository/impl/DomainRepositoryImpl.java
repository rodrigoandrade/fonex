package br.com.fonex.api.repository.impl;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import br.com.fonex.api.mock.DomainMock;
import br.com.fonex.api.mock.LicenseMock;
import br.com.fonex.api.model.Domain;
import br.com.fonex.api.model.License;
import br.com.fonex.api.repository.IDomainRepository;

@Repository
public class DomainRepositoryImpl implements IDomainRepository {

	@Override
	public List<Domain> findAll() {
		return new DomainMock().list();
	}

	@Override
	public List<Domain> findBySquad(boolean enable) {
		return new DomainMock().list().stream().filter(d -> d.getEnabled().equals(enable)).collect(Collectors.toList());
	}

	@Override
	public List<License> findPackageAvailableBy(String domainId) {
		return Arrays.asList(new LicenseMock().getLicensePackage());
	}

	@Override
	public List<License> findPackageBy(String domainId) {
		return new LicenseMock().listLicensePackage();
	}

}
