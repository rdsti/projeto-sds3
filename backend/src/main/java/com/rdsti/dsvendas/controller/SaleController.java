/**
 * 
 */
package com.rdsti.dsvendas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rdsti.dsvendas.dto.SaleDTO;
import com.rdsti.dsvendas.service.SaleService;

/**
 * @course 	 DEVSUPERIOR - SDS3
 * @author   Rodrigo Donizete Siqueira
 * @system   DSVendas
 * @create   9 de mai. de 2021
 * @version  1.0
 */

@RestController
@RequestMapping(value = "/sales")
public class SaleController {

	@Autowired
	private SaleService service;
	
		
	@GetMapping
	public ResponseEntity<Page<SaleDTO>> findAll(Pageable pageable) {
		
		Page<SaleDTO> list = service.findAll(pageable);
		
		return ResponseEntity.ok(list);
	}
	
}
