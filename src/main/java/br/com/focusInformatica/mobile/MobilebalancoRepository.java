package br.com.focusInformatica.mobile;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.focusInformatica.mobile.Models.Mobilebalanco;

import org.springframework.data.jpa.repository.Query;


;

@Repository
public interface MobilebalancoRepository extends JpaRepository<Mobilebalanco, Long> {
          
    // Retornar todas
	@Query(value = "select * from Mobilebalanco", nativeQuery= true)
	Mobilebalanco selecttodosbalanco();

	// Retornar por codigobalanco
	@Query(value = "select * from Mobilebalanco where codigobalanco = ?1", nativeQuery= true)
	Mobilebalanco findbyCodigobalanco(int codigobalanco);
	
	
}
