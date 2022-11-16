package br.com.focusInformatica.mobile;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;



import br.com.focusInformatica.mobile.Models.Mobileentradaitens;

@Repository
public interface MobileentradaitensRepository extends JpaRepository<Mobileentradaitens, Long> {
           

    // Retornar todas
	@Query(value = "select * from Mobileentradaitens", nativeQuery= true)
	Mobileentradaitens selecttodasentradas();

}
