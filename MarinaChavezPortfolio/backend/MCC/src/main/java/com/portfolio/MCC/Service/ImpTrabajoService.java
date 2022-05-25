
package com.portfolio.MCC.Service;

import com.portfolio.MCC.Entity.Trabajo;
import com.portfolio.MCC.InterFace.ITrabajoService;
import com.portfolio.MCC.Repository.ITrabajoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpTrabajoService implements ITrabajoService {
    @Autowired ITrabajoRepository itrabajoRepository;
    
    @Override
    public List<Trabajo> getTrabajo() {
        List<Trabajo> trabajo = itrabajoRepository.findAll();
        return trabajo;
    }

    @Override
    public void saveTrabajo(Trabajo trabajo) {
        itrabajoRepository.save(trabajo);
    }

    @Override
    public void deleteTrabajo(Long id) {
        itrabajoRepository.deleteById(id);
    }

    @Override
    public Trabajo findTrabajo(Long id) {
        Trabajo trabajo = itrabajoRepository.findById(id).orElse(null);
        return trabajo;
    }
}
