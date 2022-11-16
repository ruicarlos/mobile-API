package br.com.focusInformatica.mobile;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;

import br.com.focusInformatica.mobile.Models.Mobileperda;

@Repository
public interface MobileperdasRepository extends JpaRepository<Mobileperda, Long> {
           

    // Retornar todas
	@Query(value = "select * from Mobile_perda", nativeQuery= true)
	Mobileperda selecttodasaltprecoItens();

}
