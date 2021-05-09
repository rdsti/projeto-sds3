/**
 * 
 */
package com.rdsti.dsvendas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rdsti.dsvendas.entites.Sale;

/**
 * @course 	 DEVSUPERIOR - SDS3
 * @author   Rodrigo Donizete Siqueira
 * @system   DSVendas
 * @create   9 de mai. de 2021
 * @version  1.0
 */

public interface SaleRepository extends JpaRepository<Sale, Long> {

}
