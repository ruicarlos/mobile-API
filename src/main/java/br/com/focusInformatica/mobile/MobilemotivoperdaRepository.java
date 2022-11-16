package br.com.focusInformatica.mobile;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;


import java.util.List;

import br.com.focusInformatica.mobile.Models.MobileMotivoperda;

@Repository
public interface MobilemotivoperdaRepository extends JpaRepository<MobileMotivoperda, Long> {
           

    // Retornar Todos
	@Query(value = "select * from Mobile_motivoperda", nativeQuery= true)
	List<MobileMotivoperda> selectallMotivoPerdas();

    @Query(value = "select * from Mobile_motivoperda where codigomotivo = ?1", nativeQuery= true)
	MobileMotivoperda findByCodigomotivo(int Codigomotivo);

    @Query(value = "select * from Mobile_motivoperda where Descricaomotivo = ?1", nativeQuery= true)
	MobileMotivoperda findByDescricaomotivo(int Descricaomotivo);


}
