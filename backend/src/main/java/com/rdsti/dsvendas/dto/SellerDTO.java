/**
 * 
 */
package com.rdsti.dsvendas.dto;

import java.io.Serializable;

import com.rdsti.dsvendas.entites.Seller;

/**
 * @course 	 DEVSUPERIOR - SDS3
 * @author   Rodrigo Donizete Siqueira
 * @system   DSVendas
 * @create   8 de mai. de 2021
 * @version  1.0
 */

public class SellerDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;
	
	public SellerDTO() {
		
	}

	public SellerDTO(Long id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public SellerDTO(Seller entity) {
		id = entity.getId();
		name = entity.getName();
	}
	

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	

}
