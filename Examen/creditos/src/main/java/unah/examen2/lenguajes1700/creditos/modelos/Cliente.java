package unah.examen2.lenguajes1700.creditos.modelos;

import java.util.List;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import lombok.Data;

@Entity
@Table(name = "cliente")
@Data
public class Cliente {

    @Id
    private String dni;

    private String nombre;

    private String apellido;

    private String telefono;

    @OneToMany(mappedBy = "cliente")
    private List<Prestamos> prestamos;
}
