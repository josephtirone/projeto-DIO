package me.dio.academia.academiadigital.service;

import me.dio.academia.academiadigital.entity.AvaliacaoFisica;
import me.dio.academia.academiadigital.entity.Matricula;
import me.dio.academia.academiadigital.entity.form.MatriculaForm;

import java.util.List;

public interface MatriculaService {

    Matricula create(MatriculaForm form);

    Matricula get (Long id);

    List<Matricula> getAll(String bairro);

    void delete (long id);

}
