package me.dio.academia.academiadigital.repository;

import me.dio.academia.academiadigital.entity.Matricula;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MatriculaRepository extends JpaRepository<Matricula, Long> {

    List<Matricula> findByAlunoBairro(String bairro);
}
