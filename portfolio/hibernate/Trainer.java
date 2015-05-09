package Pokehib;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "trainer")
public class Trainer {
    
    @Id
    @GeneratedValue
    private Integer trainer_id;
    private String trainer_name;
    public String gettrainer_name() {
        return trainer_name;
    }
    public void settrainer_name(String trainer_name) {
        this.trainer_name = trainer_name;
    }
}
