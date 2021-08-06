package br.com.fonex.api.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.fonex.api.model.Domain;

@Repository
public interface IDomainRepository {
	
	List<Domain> findAll();
	
	List<Domain> findBySquad(boolean enable);

}
