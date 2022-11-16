package br.com.focusInformatica.mobile;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;

import br.com.focusInformatica.mobile.Models.Mobileentradalote;

@Repository
public interface MobileentradaloteRepository extends JpaRepository<Mobileentradalote, Long> {
           

    // Retornar todas
	@Query(value = "select * from Mobileentradalote", nativeQuery= true)
	List <Mobileentradalote> selectTodasEntradaLote();

    
    @Query(value = "select * from Mobileentradalote where Es_codigo = ?1", nativeQuery= true)
	List <Mobileentradalote> findByEs_codigo(int Es_codigo);

}
