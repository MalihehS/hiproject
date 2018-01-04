package hiController;

import dao.daoBean;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.inject.Inject;
import model.hi;

@Named(value = "controllerHiJSFManagedBean")
@SessionScoped
public class ControllerHiJSFManagedBean implements Serializable {

    public ControllerHiJSFManagedBean() {
      
    }
    
    @Inject
    private daoBean db;
    private Long personalNumber;
    private Long id;
    private String name;
    private String familyName;
    private String size;
    private String choice;

    
    public void submit() {
        hi a = new hi(personalNumber, name, familyName, size);
        db.addPerson(a);
//        clean();

    }

    public List<hi> allMembers() {
        return db.showAll();

    }

    public void delete() {

        db.delete(personalNumber);
////        clean();

    }
    
    public void updateNew() {
        
        hi a = db.getOneHI(personalNumber);
        System.out.println(a);
        
        if(!a.getName().equals(name)) {
            a.setName(name);
         
        }
        if(!a.getFamillyName().equals(familyName)){
            a.setFamillyName(familyName);
        }
        if(a.getPersonalNumber()!=personalNumber || a.getPersonalNumber() == 0) {
            a.setPersonalNumber(personalNumber);
        }
        if(!(a.getSize().equals(size))){
            a.setSize(size);
        }
        
        db.uppdate(a);
            
    }

    public void update() {
        db.nameUpdate(personalNumber, name);

    }

//    public void clean() {
////    personalNumber=0L;
//        name = "";
//        familyName = "";
//        size = "";
//
//    }

    public daoBean getDb() {
        return db;
    }

    public void setDb(daoBean db) {
        this.db = db;
    }

    public Long getPersonalNumber() {
        return personalNumber;
    }

    public void setPersonalNumber(Long personalNumber) {
        this.personalNumber = personalNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getChoice() {
        return choice;
    }

    public void setChoice(String choice) {
        this.choice = choice;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    
    
}
