package com.good_proyects.foro_Edwin.services.iServices;
import com.good_proyects.foro_Edwin.models.dtos.tema.Genero;
import com.good_proyects.foro_Edwin.models.dtos.tema.TemaDto;

import java.time.LocalDate;
import java.util.List;

public interface iHomeService {

    List<TemaDto> findByGenero(Genero genero);
    List<TemaDto> getTemasByDate(LocalDate localDate);


}
