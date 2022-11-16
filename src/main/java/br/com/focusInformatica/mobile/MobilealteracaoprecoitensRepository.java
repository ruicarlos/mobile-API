package br.com.focusInformatica.mobile;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;

import br.com.focusInformatica.mobile.Models.Mobilealteracaoprecoitens;

@Repository
public interface MobilealteracaoprecoitensRepository extends JpaRepository<Mobilealteracaoprecoitens, Long> {
           

    // Retornar todas
	@Query(value = "select * from Mobile_alteracaoprecoitens", nativeQuery= true)
	Mobilealteracaoprecoitens selecttodasaltprecoItens();

}
