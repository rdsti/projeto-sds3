/**
 * 
 */
package com.rdsti.dsvendas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rdsti.dsvendas.entites.Seller;

/**
 * @course 	 DEVSUPERIOR - SDS3
 * @author   Rodrigo Donizete Siqueira
 * @system   DSVendas
 * @create   8 de mai. de 2021
 * @version  1.0
 */

public interface SellerRepository extends JpaRepository<Seller, Long> {

}
