package br.com.focusInformatica.mobile;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;



import br.com.focusInformatica.mobile.Models.Mobile_estoqueserie;

@Repository
public interface MobileperdaserieRepository extends JpaRepository<Mobile_estoqueserie, Long> {
           

    // Retornar todas
	@Query(value = "select * from Mobile_estoqueserie", nativeQuery= true)
	Mobile_estoqueserie selecttodasprdas();

	// Retornar todas
	@Query(value = "select * from Mobile_estoqueserie where codigoserie = ?1", nativeQuery= true)
	Mobile_estoqueserie findbyCodigoserie(int Codigoserie);
	
	



}
