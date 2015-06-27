package VideoGames;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "RPG")
public class RPG {

	@Id
    @GeneratedValue
	private Integer RPG_id = 0;
	private String Name;
	private String Rating;
	
	public RPG() {
		
	}
	
	public String outputString() {
		
		return String.format("%-16s%-16s%-20s\n", RPG_id, Name, Rating);
	
	}
	
	
public Integer getRPG_id() {
		
		return RPG_id;
	
	}
	
	public void setRPG_id(Integer id) {
		
		this.RPG_id = id;
	
	}
	
	public String getName() {
		
		return Name;
	
	}
	
	public void setName(String Name) {
		
		this.Name = Name;
	
	}
	
	@Column( name="Rating" )
	public String gettype() {
		
		return Rating;
	
	}
	
	public void setRating(String Rating) {
		
		this.Rating = Rating;
	
	}
}
