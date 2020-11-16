package cl.sgto.jwt.dao.service;

import org.springframework.data.repository.CrudRepository;

import cl.sgto.jwt.dao.entity.Usuario;

public interface IUsuarioDao extends CrudRepository<Usuario, Long> {

	Usuario findByEmail(String email);

}
