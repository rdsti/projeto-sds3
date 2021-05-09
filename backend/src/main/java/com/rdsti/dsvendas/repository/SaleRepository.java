/**
 * 
 */
package com.rdsti.dsvendas.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.rdsti.dsvendas.dto.SaleSuccessDTO;
import com.rdsti.dsvendas.dto.SaleSumDTO;
import com.rdsti.dsvendas.entites.Sale;

/**
 * @course 	 DEVSUPERIOR - SDS3
 * @author   Rodrigo Donizete Siqueira
 * @system   DSVendas
 * @create   9 de mai. de 2021
 * @version  1.0
 */

public interface SaleRepository extends JpaRepository<Sale, Long> {
	
	@Query("SELECT new com.rdsti.dsvendas.dto.SaleSumDTO(obj.seller, SUM(obj.amount)) "
			+ "FROM Sale AS obj GROUP BY obj.seller")
	List<SaleSumDTO> amountGroupedBySeller();
	
	@Query("SELECT new com.rdsti.dsvendas.dto.SaleSuccessDTO(obj.seller, SUM(obj.visited), SUM(obj.deals)) "
			+ "FROM Sale AS obj GROUP BY obj.seller")
	List<SaleSuccessDTO> successGroupedBySeller();

}
