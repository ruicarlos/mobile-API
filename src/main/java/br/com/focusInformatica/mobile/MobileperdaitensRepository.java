package br.com.focusInformatica.mobile;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;

import br.com.focusInformatica.mobile.Models.Mobileperdaitens;

@Repository
public interface MobileperdaitensRepository extends JpaRepository<Mobileperdaitens, Long> {
           

    // Retornar todas
	@Query(value = "select * from Mobile_perdaitens", nativeQuery= true)
	Mobileperdaitens selecttodasaltprecoItens();

}
