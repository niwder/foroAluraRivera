package com.good_proyects.foro_Edwin.repository;
import com.good_proyects.foro_Edwin.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface iUsuarioRepository extends JpaRepository<Usuario,Integer> {
    boolean existsByEmail(String email);
    boolean existsByEmailAndIdNot(String email, Integer id);
    Optional<Usuario> findByEmail(String email);
}
