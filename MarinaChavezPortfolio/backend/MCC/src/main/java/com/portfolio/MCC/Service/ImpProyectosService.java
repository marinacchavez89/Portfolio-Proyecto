
package com.portfolio.MCC.Service;

import com.portfolio.MCC.Entity.Proyectos;
import com.portfolio.MCC.InterFace.IProyectosService;
import com.portfolio.MCC.Repository.IProyectosRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpProyectosService implements IProyectosService {
    @Autowired IProyectosRepository iproyectosRepository;
    
    @Override
    public List<Proyectos> getProyectos() {
        List<Proyectos> proyectos = iproyectosRepository.findAll();
        return proyectos;
    }

    @Override
    public void saveProyectos(Proyectos proyectos) {
        iproyectosRepository.save(proyectos);
    }

    @Override
    public void deleteProyectos(Long id) {
        iproyectosRepository.deleteById(id);
    }

    @Override
    public Proyectos findProyectos(Long id) {
        Proyectos proyectos = iproyectosRepository.findById(id).orElse(null);
        return proyectos;
    }
}
