package br.com.focusInformatica.mobile;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;

import br.com.focusInformatica.mobile.Models.Mobilealteracaopreco;

@Repository
public interface MobilealteracaoprecoRepository extends JpaRepository<Mobilealteracaopreco, Long> {
           

    // Retornar todas
	@Query(value = "select * from Mobilealteracaopreco", nativeQuery= true)
	Mobilealteracaopreco selecttodasaltprecoLote();

}
