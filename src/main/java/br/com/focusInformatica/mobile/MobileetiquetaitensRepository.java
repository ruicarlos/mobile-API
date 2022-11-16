package br.com.focusInformatica.mobile;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;


import java.util.List;

import br.com.focusInformatica.mobile.Models.Mobileetiquetaitens;

@Repository
public interface MobileetiquetaitensRepository extends JpaRepository<Mobileetiquetaitens, Long> {
           

    // Retornar todas
	@Query(value = "select * from Mobileetiquetaitens", nativeQuery= true)
	List<Mobileetiquetaitens> selectall();

}
