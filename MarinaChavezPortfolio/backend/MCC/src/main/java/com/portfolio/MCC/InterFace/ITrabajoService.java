
package com.portfolio.MCC.InterFace;

import com.portfolio.MCC.Entity.Trabajo;
import java.util.List;


public interface ITrabajoService {
    
    //Traer una lista de trabajo
    public List<Trabajo> getTrabajo();
    
    //Guardar un objeto de tipo trabajo
    public void saveTrabajo(Trabajo trabajo);
    
    //Eliminar objeto por ID
    public void deleteTrabajo(Long id);
    
    //Buscar una trabajo
    public Trabajo findTrabajo(Long id);
    
}
