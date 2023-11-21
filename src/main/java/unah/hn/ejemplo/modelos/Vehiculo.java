package unah.hn.ejemplo.modelos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "vehiculo")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Vehiculo {
    
    @Id
    @Column(name = "idvehiculo")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idVehiculo;

    private int anio;

    private Boolean disponible;

    private String marca;

    @ManyToOne
    private TipoVehiculo tipoVehiculo;

}
