package br.com.fonex.api.mock;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import br.com.fonex.api.model.Item;
import br.com.fonex.api.model.License;

public class LicenseMock {
	
	public License getLicensePackage() {
		return new License(UUID.randomUUID().toString(), null, null, null, "URA", null, new ArrayList<>());
	}
	
	public List<License> listLicensePackage() {
	    Item item1 = new Item(UUID.randomUUID().toString(), "USUARIO_ATENDENTE_CADASTRADO", true, UUID.randomUUID().toString());
		License license1 = new License( UUID.randomUUID().toString(), UUID.randomUUID().toString(), null, UUID.randomUUID().toString(), "CallCenter", 100, Arrays.asList(item1));
		
	    Item item2 = new Item(UUID.randomUUID().toString(), "RAMAL", true, UUID.randomUUID().toString());
		License license2 = new License(UUID.randomUUID().toString(), UUID.randomUUID().toString(), null, UUID.randomUUID().toString(), "Cloud Phone Softphone", 100, Arrays.asList(item2));

		Item item3 = new Item(UUID.randomUUID().toString(), "Gravação", true, UUID.randomUUID().toString());
		License license3 = new License(UUID.randomUUID().toString(), UUID.randomUUID().toString(), null, UUID.randomUUID().toString(), "Gravação", 100, Arrays.asList(item3));
		
		return Arrays.asList(license1, license2, license3);
	}
}
