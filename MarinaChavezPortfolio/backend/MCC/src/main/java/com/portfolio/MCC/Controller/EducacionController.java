
package com.portfolio.MCC.Controller;

import com.portfolio.MCC.Entity.Educacion;
import com.portfolio.MCC.InterFace.IEducacionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EducacionController {
    @Autowired IEducacionService ieducacionService;
    
    @GetMapping("educacion/traer")
    public List<Educacion> getEducacion(){
        return ieducacionService.getEducacion();
    }
    
    @PostMapping("/educacion/crear")
    public String createEducacion (@RequestBody Educacion educacion){
        ieducacionService.saveEducacion(educacion);
        return "La educacion fue creada correctamente";
    }
    
    @DeleteMapping("/educacion/borrar/{id}")
    public String deleteEducacion(@PathVariable Long id){
    ieducacionService.deleteEducacion(id);
    return "La educacion fue eliminada correctamente";
    }
    
    //URL:PUERTO/educacion/editar/1/nombre=nuevoNombre
    @PutMapping("/educacion/editar/{id}")
    public Educacion editEducacion(@PathVariable Long id,
            @RequestParam("nombre") String nuevoNombre) {
     Educacion educacion = ieducacionService.findEducacion(id);
     educacion.setNombre(nuevoNombre);
     
     ieducacionService.saveEducacion(educacion);
     return educacion;
    }
    
}
