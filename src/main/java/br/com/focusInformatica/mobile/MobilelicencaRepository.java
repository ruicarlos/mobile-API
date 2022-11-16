package br.com.focusInformatica.mobile;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;


import java.util.List;

import br.com.focusInformatica.mobile.Models.Mobilelicenca;

@Repository
public interface MobilelicencaRepository extends JpaRepository<Mobilelicenca, Long> {
           

    // Retornar Todos
	@Query(value = "select * from Mobilelicenca", nativeQuery= true)
	List<Mobilelicenca> selectall();

    // Pesquisa por CodigoEstação 
    @Query(value = "select * from Mobilelicenca where codigoestacao = ?1", nativeQuery= true)
	Mobilelicenca findByCodigoestacao(int Codigoestacao);

    // Pesquisa por NomeEstação
    @Query(value = "select * from Mobilelicenca where nomeestacaomobile like %?1%", nativeQuery= true)
    Mobilelicenca findByNomeestacaomobile(String Nomeestacaomobile);

    // Pesquisa por Numeroseriemobile
    @Query(value = "select * from Mobilelicenca where nueroseriemobile like %?1%", nativeQuery= true)
    Mobilelicenca findByNumeroseriemobile(String Numeroseriemobile);

    // Pesquisa por Token
    @Query(value = "select * from Mobilelicenca where tokenmobile like %?1%", nativeQuery= true)
    Mobilelicenca findByTokenmobile(String Tokenmobile);

}
