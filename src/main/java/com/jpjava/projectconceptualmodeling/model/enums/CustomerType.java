package com.jpjava.projectconceptualmodeling.model.enums;

public enum CustomerType {
	
	
	PESSOAFISICA (1, "Pessoa Fisíca"),
	PESSOAJURIDICA (2, "Pessoa Jurídica");
	
	private int code;
	private String description;
	
	private CustomerType(int code, String description) {
		
		this.code = code;
		this.description = description;
	}

	public int getCode() {
		return code;
	}

	public String getDescription() {
		return description;
	}
	
	public static CustomerType toEnum(Integer code) {
		
		if(code == null) {
			return null;
		}
		for (CustomerType x : CustomerType.values()) {
			if(code.equals(x.getCode())){
				return x;
			}
		}
		throw new IllegalArgumentException("Id inválido " + code);
		
	}

}
