package unah.examen2.lenguajes1700.creditos.modelos;

import java.time.LocalDate;
import java.util.List;

import jakarta.annotation.Generated;
import lombok.Data;

@Entity
@Table(name = "prestamos")
@Data
public class Prestamos {

    @Id
    @Generated( strategy = GenerateType.IDENTITY)
    @Column(name = "codigoprestamo")
    private long codigoPrestamo;

    @Column(name = "fechaapertura")
    private LocalDate fechaApertura;

    private double monto;

    private double cuota;

    private long plazo;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "dni")
    private Cliente cliente;

    @ManyToOne(cascade = CascadeType.ALL)
    private List<Cuotas> cuotas;

}
