package br.com.fonex.api.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(content = Include.NON_NULL)
public class Domain {
	
	private String name;
	private String description;
	private Integer code;
	private Boolean enabled;
	
	private Integer ddd;
	private Integer prefix;
	private String defaultExtension;
	private String exitRouteCode;
	
	public Domain(String name, String description, Integer code, Boolean enabled) {
		this.name = name;
		this.description = description;
		this.code = code;
		this.enabled = enabled;
	}

	public Domain(String name, String description, Integer code, Boolean enabled, Integer ddd, Integer prefix,
			String defaultExtension, String exitRouteCode) {
		this.name = name;
		this.description = description;
		this.code = code;
		this.enabled = enabled;
		this.ddd = ddd;
		this.prefix = prefix;
		this.defaultExtension = defaultExtension;
		this.exitRouteCode = exitRouteCode;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public Integer getCode() {
		return code;
	}

	public Boolean getEnabled() {
		return enabled;
	}

	public Integer getDdd() {
		return ddd;
	}

	public Integer getPrefix() {
		return prefix;
	}

	public String getDefaultExtension() {
		return defaultExtension;
	}

	public String getExitRouteCode() {
		return exitRouteCode;
	}

}
