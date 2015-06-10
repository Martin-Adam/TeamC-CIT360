package UnitOrder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Mongoose")
public class Mongoose {

	@Id
    @GeneratedValue
	private Integer Mongoose_id = 0;
	private String Name;
	private String Weapon;
	
	public Mongoose() {
		
	}
	
	public String outputString() {
		
		return String.format("%-16s%-16s%-20s\n", Mongoose_id, Name, Weapon);
	
	}
	
	
public Integer getMongoose_id() {
		
		return Mongoose_id;
	
	}
	
	public void setMongoose_id(Integer id) {
		
		this.Mongoose_id = id;
	
	}
	
	public String getName() {
		
		return Name;
	
	}
	
	public void setName(String Name) {
		
		this.Name = Name;
	
	}
	
	@Column( name="Weapon" )
	public String gettype() {
		
		return Weapon;
	
	}
	
	public void setWeapon(String Weapon) {
		
		this.Weapon = Weapon;
	
	}
}
