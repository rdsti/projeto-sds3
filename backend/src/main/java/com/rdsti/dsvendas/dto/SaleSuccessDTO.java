/**
 * 
 */
package com.rdsti.dsvendas.dto;

import com.rdsti.dsvendas.entites.Seller;

/**
 * @course 	 DEVSUPERIOR - SDS3
 * @author   Rodrigo Donizete Siqueira
 * @system   DSVendas
 * @create   9 de mai. de 2021
 * @version  1.0
 */

public class SaleSuccessDTO {
	
	private String sellerName;
	private Long visited;
	private Long deals;
	
	public SaleSuccessDTO() {
		
	}


	public SaleSuccessDTO(Seller seller, Long visited, Long deals) {
		sellerName = seller.getName();
		this.visited = visited;
		this.deals = deals;
	}


	/**
	 * @return the sellerName
	 */
	public String getSellerName() {
		return sellerName;
	}


	/**
	 * @param sellerName the sellerName to set
	 */
	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}


	/**
	 * @return the visited
	 */
	public Long getVisited() {
		return visited;
	}


	/**
	 * @param visited the visited to set
	 */
	public void setVisited(Long visited) {
		this.visited = visited;
	}


	/**
	 * @return the deals
	 */
	public Long getDeals() {
		return deals;
	}


	/**
	 * @param deals the deals to set
	 */
	public void setDeals(Long deals) {
		this.deals = deals;
	}
	
	

}
