package Pokehib;

import Pokehib.Trainer;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Column;

import java.util.Set;
@Entity
@Table(name = "pokestarters")
public class Pokemonstarters {

	@Id
    @GeneratedValue
	private Integer pokemon_id;
	private String pokemon_name;
	private String type;
	
    @ManyToOne(cascade=CascadeType.ALL)
    @JoinTable(
               name="poke_number",
               joinColumns = { @JoinColumn( name="pokestarters_id") },
               inverseJoinColumns = @JoinColumn( name="trainer_id")
               )
    private Trainer trainers;
    
	public Pokemonstarters() {
		
	}
	
	public String outputJoinString() {
        return String.format("%-16s%-16s%-20s\n", pokemon_id, pokemon_name, trainers.gettrainer_name());
    }
	
	public String outputString() {
		
		return String.format("%-16s%-16s%-20s\n", pokemon_id, pokemon_name, type);
	
	}
	
	public Integer getpokemon_id() {
		
		return pokemon_id;
	
	}
	
	public void setpokemon_id(Integer pokemon_id) {
		
		this.pokemon_id = pokemon_id;
	
	}
	
	public String getpokemon_name() {
		
		return pokemon_name;
	
	}
	
	public void setpokemon_name(String pokemon_name) {
		
		this.pokemon_name = pokemon_name;
	
	}
	
	@Column( name="type" )
	public String gettype() {
		
		return type;
	
	}
	
	public void settype(String type) {
		
		this.type = type;
	
	}
}
