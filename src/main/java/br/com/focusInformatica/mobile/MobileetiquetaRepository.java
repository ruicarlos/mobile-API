package br.com.focusInformatica.mobile;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;



import br.com.focusInformatica.mobile.Models.Mobileetiqueta;

@Repository
public interface MobileetiquetaRepository extends JpaRepository<Mobileetiqueta, Long> {
           

    // Retornar todas
	@Query(value = "select top 1* from Mobileetiqueta order by codigoid desc", nativeQuery= true)
	Mobileetiqueta selectMax();

}
