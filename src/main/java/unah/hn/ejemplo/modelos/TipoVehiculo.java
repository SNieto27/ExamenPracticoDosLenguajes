package unah.hn.ejemplo.modelos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tipovehiculo")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TipoVehiculo {
    
    @Id
    @Column(name = "idtipovehiculo")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTipoVehiculo;

    private String descripcion;

    @Column(name = "precioxhora")
    private Double precioPorHora;

}
