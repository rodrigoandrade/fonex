package br.com.fonex.api.model;

import java.util.List;

public class License {

	private String id;
	private String domainUuid;
	private String domainName;
	private String licensePackageId;
	private String licensePackageName;
	private Integer quantity;
	private List<Item> itens;
	
	public License(String id, String domainUuid, String domainName, String licensePackageId, String licensePackageName,
			Integer quantity, List<Item> itens) {
		this.id = id;
		this.domainUuid = domainUuid;
		this.domainName = domainName;
		this.licensePackageId = licensePackageId;
		this.licensePackageName = licensePackageName;
		this.quantity = quantity;
		this.itens = itens;
	}

	public String getId() {
		return id;
	}

	public String getDomainUuid() {
		return domainUuid;
	}

	public String getDomainName() {
		return domainName;
	}

	public String getLicensePackageId() {
		return licensePackageId;
	}

	public String getLicensePackageName() {
		return licensePackageName;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public List<Item> getItens() {
		return itens;
	}
	
}
