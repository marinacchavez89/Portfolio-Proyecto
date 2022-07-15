
package com.portfolio.MCC.Controller;

import com.portfolio.MCC.Entity.Skills;
import com.portfolio.MCC.InterFace.ISkillsService;
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

public class SkillsController {
     @Autowired ISkillsService iskillsService;
     
     @GetMapping("skills/traer")
    public List<Skills> getSkills(){
        return iskillsService.getSkills();
    }
    
    @PostMapping("/skills/crear")
    public String createSkills(@RequestBody Skills skills){
        iskillsService.saveSkills(skills);
        return "El skill fue creado correctamente";
    }
    
    @DeleteMapping("/skills/borrar/{id}")
    public String deleteSkills(@PathVariable Long id){
    iskillsService.deleteSkills(id);
    return "El skill fue eliminado correctamente";
    }
    
    //URL:PUERTO/personas/editar/1?nombre=nuevoNombre&imgperfil=nuevoImgPerfil
    @PutMapping("/skills/editar/{id}")
    public Skills editSkills(@PathVariable Long id,
            @RequestParam("url") String nuevoUrl
            ){
     Skills skills = iskillsService.findSkills(id);
     skills.setUrl(nuevoUrl);
    
     
     iskillsService.saveSkills(skills);
     return skills;
    }
    
    @GetMapping("/skills/traer/perfil")
    public Skills findSkills(){
        return iskillsService.findSkills((long)1);
    }
}
