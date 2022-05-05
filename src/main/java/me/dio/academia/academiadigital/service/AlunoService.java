package me.dio.academia.academiadigital.service;

import me.dio.academia.academiadigital.entity.Aluno;
import me.dio.academia.academiadigital.entity.AvaliacaoFisica;
import me.dio.academia.academiadigital.entity.form.AlunoForm;
import me.dio.academia.academiadigital.entity.form.AlunoUpdateForm;

import java.util.List;

public interface AlunoService {

    Aluno create (AlunoForm form);

    Aluno get (Long id);

    List<Aluno> getAll(String dataDeNascimento);

    Aluno update (Long id, AlunoUpdateForm formUpdate);

    void delete (Long id);

    List<AvaliacaoFisica> getAllAvaliacaoFisicaIdsicaId(Long id);
}
