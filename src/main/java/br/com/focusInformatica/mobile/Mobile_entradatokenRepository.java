package br.com.focusInformatica.mobile;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.focusInformatica.mobile.Models.Mobile_entradatoken;

import org.springframework.data.jpa.repository.Query;



@Repository
public interface Mobile_entradatokenRepository extends JpaRepository<Mobile_entradatoken, Long> {
          
    // Retornar todas
	@Query(value = "select * from Mobile_entradatoken", nativeQuery= true)
	List<Mobile_entradatoken> selecttodosmotivos();

	// Retornar por Token
	@Query(value = "select * from Mobile_entradatoken where Tokenmobile = ?1", nativeQuery= true)
	Mobile_entradatoken findbyTokenmobile(String Tokenmobile);
	
	
}
