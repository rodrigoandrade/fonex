package br.com.fonex.api.mock;

import java.util.Arrays;
import java.util.List;

import br.com.fonex.api.model.Domain;

public class DomainMock {
	
	public Domain getDomainTest2Enable() {
		return new Domain("test2.domain.com.br", "Create domain API", 1, true);
	}
	
	public Domain getDomain2Disable() {
		return new Domain("test2.domain.com.br", "Create domain API", 1, false);
	}

	public Domain getDomainTest3Enable() {
		return new Domain("test3.domain.com.br", "Create domain API", 1, true);
	}
	
	public Domain getDomain3Disable() {
		return new Domain("test3.domain.com.br", "Create domain API", 1, true, 34, 3221, "0000", "07868");
	}
	
	public List<Domain> list() {
		return Arrays.asList(getDomain2Disable(), getDomain3Disable(), getDomainTest2Enable(), getDomainTest3Enable());
	}
}
