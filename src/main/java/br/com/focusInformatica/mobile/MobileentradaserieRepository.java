package br.com.focusInformatica.mobile;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;

import br.com.focusInformatica.mobile.Models.Mobileentradaserie;

@Repository
public interface MobileentradaserieRepository extends JpaRepository<Mobileentradaserie, Long> {
           

    // Retornar todas
	@Query(value = "select * from Mobileentradaserie", nativeQuery= true)
	List <Mobileentradaserie> selectTodasEntradaSerie();

    
    @Query(value = "select * from Mobile_motivoperda where Es_codigo = ?1", nativeQuery= true)
	List <Mobileentradaserie> findByEs_codigo(int Es_codigo);


    @Query(value = "select * from Mobile_motivoperda where Numeroserie = ?1", nativeQuery= true)
	List <Mobileentradaserie> findByNumeroserie(String Numeroserie);

}
