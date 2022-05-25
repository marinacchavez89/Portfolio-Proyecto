
package com.portfolio.MCC.InterFace;

import com.portfolio.MCC.Entity.Educacion;
import java.util.List;


public interface IEducacionService {
    
    //Traer una lista de Educacion
    public List<Educacion> getEducacion();
    
    //Guardar un objeto de tipo Educacion
    public void saveEducacion(Educacion educacion);
    
    //Eliminar objeto por ID
    public void deleteEducacion(Long id);
    
    //Buscar una Educacion
    public Educacion findEducacion(Long id);
}
