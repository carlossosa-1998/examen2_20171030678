package unah.examen2.lenguajes1700.creditos.repositorios;

import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepositorio extends JpaRepository<Cliente, String>{

}
