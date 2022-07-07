
package com.portfolio.MCC.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Trabajo {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)    
    
    private Long id;
    
    @NotNull
    private String nombre;

    public void setNombre(String nuevoNombre) {
    }    
    
}
