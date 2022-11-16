package br.com.focusInformatica.mobile;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;



import br.com.focusInformatica.mobile.Models.Mobile_estoquelote;

@Repository
public interface MobileperdaloteRepository extends JpaRepository<Mobile_estoquelote, Long> {
          
    // Retornar todas
	@Query(value = "select * from Mobile_estoquelote", nativeQuery= true)
	Mobile_estoquelote selecttodoslote();

	// Retornar por loteid
	@Query(value = "select * from Mobile_estoquelote where codigoloteproduto = ?1", nativeQuery= true)
	Mobile_estoquelote findbyCodigoloteproduto(int Codigoloteproduto);
	
	
}
