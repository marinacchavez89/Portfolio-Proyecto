
package com.portfolio.MCC.Controller;

import com.portfolio.MCC.Entity.Persona;
import com.portfolio.MCC.InterFace.IPersonaService;
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
@CrossOrigin(origins = "https://portfolioapp-5b884.web.app")

public class PersonaController {
    @Autowired IPersonaService ipersonaService;
    
    @GetMapping("personas/traer")
    public List<Persona> getPersona(){
        return ipersonaService.getPersona();
    }
    
    @PostMapping("/personas/crear")
    public String createPersona(@RequestBody Persona persona){
        ipersonaService.savePersona(persona);
        return "La persona fue creada correctamente";
    }
    
    @DeleteMapping("/personas/borrar/{id}")
    public String deletePersona(@PathVariable Long id){
    ipersonaService.deletePersona(id);
    return "La persona fue eliminada correctamente";
    }
    
    //URL:PUERTO/personas/editar/1?nombre=nuevoNombre&imgperfil=nuevoImgPerfil
    @PutMapping("/personas/editar/{id}")
    public Persona editPersona(@PathVariable Long id,
            @RequestParam("nombre") String nuevoNombre,
            @RequestParam("imgperfil") String nuevoImgPerfil,
            @RequestParam("redes") String nuevoRedes){
     Persona persona = ipersonaService.findPersona(id);
     persona.setNombre(nuevoNombre);
     persona.setImgperfil(nuevoImgPerfil);
     persona.setRedes(nuevoRedes);
     
     ipersonaService.savePersona(persona);
     return persona;
    }
    
    @GetMapping("/personas/traer/perfil")
    public Persona findPersona(){
        return ipersonaService.findPersona((long)1);
    }
            
}
