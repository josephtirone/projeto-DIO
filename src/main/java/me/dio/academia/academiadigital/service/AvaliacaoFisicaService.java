package me.dio.academia.academiadigital.service;

import me.dio.academia.academiadigital.entity.AvaliacaoFisica;
import me.dio.academia.academiadigital.entity.form.AvaliacaoFisicaForm;
import me.dio.academia.academiadigital.entity.form.AvaliacaoFisicaUpdateForm;

import java.util.List;

public interface AvaliacaoFisicaService {
    AvaliacaoFisica create (AvaliacaoFisicaForm form);

    AvaliacaoFisica get (Long id);

    List<AvaliacaoFisica> getAll();

    AvaliacaoFisica update (Long id, AvaliacaoFisicaUpdateForm formUpdate);

    void delete (Long id);
}
