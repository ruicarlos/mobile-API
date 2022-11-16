package br.com.focusInformatica.mobile;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.focusInformatica.mobile.Models.Mobile_motivoalteracaopreco;

import org.springframework.data.jpa.repository.Query;



@Repository
public interface Mobile_motivoalteracaoprecoRepository extends JpaRepository<Mobile_motivoalteracaopreco, Long> {
          
    // Retornar todas
	@Query(value = "select * from Mobile_motivoalteracaopreco", nativeQuery= true)
	List<Mobile_motivoalteracaopreco> selecttodosmotivos();

	// Retornar por codigo e inativo
	@Query(value = "select * from Mobile_motivoalteracaopreco where codigoempresa = ?1", nativeQuery= true)
	Mobile_motivoalteracaopreco findbyCodigomotivoAndInativo(int Codigomotivo);
	
	
}
