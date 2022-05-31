package core.repository;
import core.model.Wizard;


import java.util.List;

public interface IWizardRepository extends IRepository<Wizard, Long>{
    List<Wizard> findAllByName(String name);

}
