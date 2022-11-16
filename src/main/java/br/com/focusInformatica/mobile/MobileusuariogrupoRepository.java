package br.com.focusInformatica.mobile;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;


import java.util.List;

import br.com.focusInformatica.mobile.Models.Mobileusuariogrupo;

@Repository
public interface MobileusuariogrupoRepository extends JpaRepository<Mobileusuariogrupo, Long> {
           

    // Retornar Todos
	@Query(value = "select * from Mobileusuariogrupo", nativeQuery= true)
	List<Mobileusuariogrupo> selectall();

    // Pesquisa por codigogrupo 
    @Query(value = "select * from Mobileusuariogrupo where codigogrupousuario = ?1", nativeQuery= true)
	Mobileusuariogrupo findByCodigogrupousuario(int Codigogrupousuario);

    // Pesquisa por Departamento e IdLoja
    @Query(value = "select * from Mobileusuariogrupo where nomegrupo like %?1%", nativeQuery= true)
    Mobileusuariogrupo findByNomegrupo(String Nomegrupo);

}
