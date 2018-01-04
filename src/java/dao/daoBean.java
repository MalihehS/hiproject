package dao;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
//import javax.persistence.Query;
import model.hi;

@Stateless
public class daoBean {

    @PersistenceContext
    EntityManager em;

    public void addPerson(hi h) {
        em.persist(h);
    }

    public void delete(Long personalNumber) {
        hi person = em.find(hi.class, personalNumber);
        em.remove(em.merge(person));

    }

    public void nameUpdate(Long personalNumber, String name) {
        hi person2 = em.find(hi.class, personalNumber);

        person2.setName(name);

    }

    public List<hi> showAll() {
        return em.createQuery("SELECT e FROM hi AS e").getResultList();

    }
    
    public hi getOneHI(Long id) {
        return em.find(hi.class, id);
    }
    
    public void uppdate(hi a){
    em.merge(a);
    }

}
