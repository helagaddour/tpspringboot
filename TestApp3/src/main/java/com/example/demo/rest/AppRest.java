package com.example.demo.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.IMagasinDao;
import com.example.demo.dao.IProduitDao;
import com.example.demo.model.Magasin;
import com.example.demo.model.Produit;


@RestController
public class AppRest {

	
	@Autowired
	IProduitDao daop ;
	@Autowired
	IMagasinDao daom;
	public void setDaop(IProduitDao daop) {
		this.daop = daop;
	}
	public void setDaom(IMagasinDao daom) {
		this.daom = daom;
	}

	@GetMapping("/magasin")
	 
		public List<Magasin> get1()
	{
		
		return daom.findAll(); 
	}
	
	@GetMapping("/produit")
	 
	public List<Produit> get2()
{
	
	return daop.findAll(); 
}
	@PostMapping("/ajouterproduit")
	public void addp(@RequestBody Produit p) {
		daop.save(p);
		
	}
	@PostMapping("/ajoutermagasin")
	public void addm(@RequestBody Magasin m) {
		daom.save(m);
		
	}
	@DeleteMapping("/deleteproduit/{id}")
	public void delp(@PathVariable int id) {
		daop.deleteById(id);
	}
	@DeleteMapping("/deletemagasin/{id}")
	public void delm(@PathVariable int id) {
		daom.deleteById(id);
	}
}















