
package com.portfolio.MCC.Controller;

import com.portfolio.MCC.Entity.Trabajo;
import com.portfolio.MCC.InterFace.ITrabajoService;
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
public class TrabajoController {
    @Autowired ITrabajoService itrabajoService;
    
    @GetMapping("trabajo/traer")
    public List<Trabajo> getTrabajo(){
        return itrabajoService.getTrabajo();
    }
    
    @PostMapping("/trabajo/crear")
    public String createTrabajo (@RequestBody Trabajo trabajo){
        itrabajoService.saveTrabajo(trabajo);
        return "El trabajo fue creado correctamente";
    }
    
    @DeleteMapping("/trabajo/borrar/{id}")
    public String deleteTrabajo(@PathVariable Long id){
    itrabajoService.deleteTrabajo(id);
    return "El trabajo fue eliminado correctamente";
    }
    
    //URL:PUERTO/trabajo/editar/1?nombre=nuevoNombre
    @PutMapping("/trabajo/editar/{id}")
    public Trabajo editTrabajo(@PathVariable Long id,
            @RequestParam("nombre") String nuevoNombre) {
     Trabajo trabajo = itrabajoService.findTrabajo(id);
     trabajo.setNombre(nuevoNombre);
     
     itrabajoService.saveTrabajo(trabajo);
     return trabajo;
    }
}
