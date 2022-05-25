
package com.portfolio.MCC.Repository;

import com.portfolio.MCC.Entity.Trabajo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITrabajoRepository extends JpaRepository<Trabajo, Long> {
    
}
