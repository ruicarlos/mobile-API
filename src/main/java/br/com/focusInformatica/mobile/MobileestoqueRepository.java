package br.com.focusInformatica.mobile;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;

import java.math.BigDecimal;
import java.util.List;

import br.com.focusInformatica.mobile.Models.Mobileestoque;

@Repository
public interface MobileestoqueRepository extends JpaRepository<Mobileestoque, Long> {
           
  //  List<View_estoque> findAllByCodigoean(String codigoean);

    // Pesquisa por codigo de Barras
	@Query(value = "select * from Mobileestoque where codigo_barra like %?1% ", nativeQuery= true)
	Mobileestoque selectporcodbarra(String codigo_barra);

    // Pesquisa por nome do produto e IdLoja 
    @Query(value = "select * from Mobileestoque where nome like %?1% and id_loja = ?2 order by nome asc", nativeQuery= true)
	List<Mobileestoque> findMobileestoquesByNomeAndId_loja(String Nome, int Id_Loja);
        
    // Pesquisa por Departamento e IdLoja
    @Query(value = "select * from Mobileestoque where departamento like %?1% and Id_loja = ?2", nativeQuery= true)
    List<Mobileestoque> findByDepartamentoAndId_Loja(String Departamento, int Id_Loja );
    
    // Pesquisa por Departamento Categoria e IdLoja
    @Query(value = "select * from Mobileestoque where departamento like %?1% and categoria like %?2% and Id_loja = ?3", nativeQuery= true)
    List<Mobileestoque> findByDepartamentoAndCategoriaAndId_Loja(String Departamento,String Categoria, int Id_Loja );


    // Pesquisa por Departamento Categoria Subcategoria e IdLoja
    @Query(value = "select * from Mobileestoque where departamento like %?1% and categoria like %?2% and subcategoria like %?3%  and Id_loja = ?4", nativeQuery= true)
    List<Mobileestoque> findByDepartamentoAndCategoriaAndSubcategoriaAndSubcategoriaAndId_Loja(String Departamento,String Categoria,String Subcategoria, int Id_Loja );
    

    // Pesquisa por Departamento Categoria Subcategoria Marca IdLoja
    @Query(value = "select * from Mobileestoque where departamento like %?1% and categoria like %?2% and subcategoria like %?3% and marca like %?4%  and Id_loja = ?5", nativeQuery= true)
    List<Mobileestoque> findByDepartamentoAndCategoriaAndSubcategoriaAndSubcategoriaAndMarcaAndId_Loja(String Departamento,String Categoria,String Subcategoria, String Marca, int Id_Loja );
    

    // Pesquisa por QtdAtual em Estoque IdLoja Meno igual
    @Query(value = "select * from Mobileestoque where qtd_estoque_atual <=?1 and Id_loja = ?2", nativeQuery= true)
    List<Mobileestoque> findByQtd_estoque_atualAndId_Loja(BigDecimal qtd_estoque_atual, int Id_Loja );
    

}
