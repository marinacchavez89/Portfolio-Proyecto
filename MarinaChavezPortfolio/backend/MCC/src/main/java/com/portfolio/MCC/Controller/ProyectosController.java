
package com.portfolio.MCC.Controller;

import com.portfolio.MCC.Entity.Proyectos;
import com.portfolio.MCC.InterFace.IProyectosService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = {"https://portfoliomcc-38e6c.firebaseapp.com/#/iniciar-sesion", "http://localhost:4200/", 
    "https://portfoliomcc-38e6c.web.app/#/portfolio", "https://portfoliomcc-38e6c.web.app"})
public class ProyectosController {
    @Autowired IProyectosService iproyectosService;
     
     @GetMapping("proyectos/traer")
    public List<Proyectos> getProyectos(){
        return iproyectosService.getProyectos();
    }
    
    @PostMapping("/proyectos/crear")
    public String createProyectos(@RequestBody Proyectos proyectos){
        iproyectosService.saveProyectos(proyectos);
        return "El Proyecto fue creado correctamente";
    }
    
    @DeleteMapping("/proyectos/borrar/{id}")
    public String deleteProyectos(@PathVariable Long id){
    iproyectosService.deleteProyectos(id);
    return "El Proyecto fue eliminado correctamente";
    }
    
    //URL:PUERTO/personas/editar/1?nombre=nuevoNombre&imgperfil=nuevoImgPerfil
    @PutMapping("/proyectos/editar/{id}")
    public Proyectos editProyectos(@PathVariable Long id,
            @RequestParam("url") String nuevoUrl
            ){
     Proyectos proyectos = iproyectosService.findProyectos(id);
     proyectos.setUrl(nuevoUrl);
    
     
     iproyectosService.saveProyectos(proyectos);
     return proyectos;
    }
    
    @GetMapping("/proyectos/traer/perfil")
    public Proyectos findProyectos(){
        return iproyectosService.findProyectos((long)1);
    }
}
