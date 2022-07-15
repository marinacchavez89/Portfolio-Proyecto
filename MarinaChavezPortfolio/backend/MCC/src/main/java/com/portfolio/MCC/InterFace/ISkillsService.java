
package com.portfolio.MCC.InterFace;

import com.portfolio.MCC.Entity.Skills;
import java.util.List;


public interface ISkillsService {
    public List<Skills> getSkills();    
    public void saveSkills(Skills skills);
    public void deleteSkills(Long id);
    public Skills findSkills(Long id);
}
