package unah.examen2.lenguajes1700.creditos.modelos;

import java.util.List;

import jakarta.annotation.Generated;
import lombok.Data;

@Entity
@Table(name = "cuotas")
@Data
public class Cuotas {

    @Id
     @Generated( strategy = GenerateType.IDENTITY)
     @Column(name = "codigocuota")
    private long codigoCuota;

    private long mes;

    private double interes;

    private double capital;

    private double saldo;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "codigoprestamo")
    private Prestamos prestamo;
}
