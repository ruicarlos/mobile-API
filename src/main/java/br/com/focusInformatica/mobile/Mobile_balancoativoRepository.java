package br.com.focusInformatica.mobile;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.focusInformatica.mobile.Models.Mobile_balancoativo;

import org.springframework.data.jpa.repository.Query;



@Repository
public interface Mobile_balancoativoRepository extends JpaRepository<Mobile_balancoativo, Long> {
          
    // Retornar todas
	@Query(value = "select * from Mobile_balancoativo", nativeQuery= true)
	Mobile_balancoativo selectBalacoativo();

	// Retornar por empresa
	@Query(value = "select * from Mobile_balancoativo where Codigoempresa = ?1", nativeQuery= true)
	Mobile_balancoativo findbyCodigoempresa(int Codigoempresa);
	
	
}
