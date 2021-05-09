/**
 * 
 */
package com.rdsti.dsvendas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rdsti.dsvendas.dto.SellerDTO;
import com.rdsti.dsvendas.service.SellerService;

/**
 * @course 	 DEVSUPERIOR - SDS3
 * @author   Rodrigo Donizete Siqueira
 * @system   DSVendas
 * @create   8 de mai. de 2021
 * @version  1.0
 */

@RestController
@RequestMapping(value = "/sellers")
public class SellerController {
	
	@Autowired
	private SellerService service;
	
	@GetMapping
	public ResponseEntity<List<SellerDTO>> findAll() {
		
		List<SellerDTO> list = service.findAll();
		
		return ResponseEntity.ok(list);
	}

}
