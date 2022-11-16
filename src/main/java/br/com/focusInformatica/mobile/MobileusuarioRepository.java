package br.com.focusInformatica.mobile;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;


import java.util.List;

import br.com.focusInformatica.mobile.Models.Mobileusuario;

@Repository
public interface MobileusuarioRepository extends JpaRepository<Mobileusuario, Long> {
           

    // Retornar Todos
	@Query(value = "select * from Mobileusuario", nativeQuery= true)
	List<Mobileusuario> selectall();

    // Pesquisa por codigogrupo 
    @Query(value = "select * from Mobileusuario where codigousuario = ?1", nativeQuery= true)
	Mobileusuario findByCodigousuario(int Codigosuario);

    // Pesquisa NomeUsuario
    @Query(value = "select * from Mobileusuario where nomeusuario like %?1%", nativeQuery= true)
    Mobileusuario findByNomeusuario(String Nomeusuario);


    // Pesquisa por Nomeusuario e Senha
    @Query(value = "select * from Mobileusuario where nomeusuario like %?1% and senha like %?2%", nativeQuery= true)
    Mobileusuario findByNomeusuarioAndSenha(String Nomeusuario, String Senha);

}
