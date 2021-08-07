package br.com.fonex.api.model;

public class Item {

	private String id;
	private String item;
	private Boolean reference;
	private String licensePackageId;
	
	public Item(String id, String item, Boolean reference, String licensePackageId) {
		this.id = id;
		this.item = item;
		this.reference = reference;
		this.licensePackageId = licensePackageId;
	}

	public String getId() {
		return id;
	}

	public String getItem() {
		return item;
	}

	public Boolean getReference() {
		return reference;
	}

	public String getLicensePackageId() {
		return licensePackageId;
	}

}
