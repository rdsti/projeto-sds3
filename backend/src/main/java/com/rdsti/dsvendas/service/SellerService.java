/**
 * 
 */
package com.rdsti.dsvendas.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rdsti.dsvendas.dto.SellerDTO;
import com.rdsti.dsvendas.entites.Seller;
import com.rdsti.dsvendas.repository.SellerRepository;

/**
 * @course 	 DEVSUPERIOR - SDS3
 * @author   Rodrigo Donizete Siqueira
 * @system   DSVendas
 * @create   8 de mai. de 2021
 * @version  1.0
 */

@Service
public class SellerService {
	
	@Autowired
	private SellerRepository repository;
	
	public List<SellerDTO> findAll() {
		
		List<Seller> result = repository.findAll();
		
		return result.stream().map(x -> new SellerDTO(x)).collect(Collectors.toList());
	}

}
