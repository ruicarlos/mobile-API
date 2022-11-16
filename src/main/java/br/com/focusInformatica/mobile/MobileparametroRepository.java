package br.com.focusInformatica.mobile;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.focusInformatica.mobile.Models.Mobileparametro;

import org.springframework.data.jpa.repository.Query;


;

@Repository
public interface MobileparametroRepository extends JpaRepository<Mobileparametro, Long> {
          
    // Retornar todas
	@Query(value = "select * from Mobileparametro", nativeQuery= true)
	Mobileparametro selecttodosparametros();

	// Retornar por codigoEmpresa
	@Query(value = "select * from Mobileparametro where codigoempresa = ?1", nativeQuery= true)
	Mobileparametro findbyCodigoempresa(int Codigoempresa);
	
	
}
