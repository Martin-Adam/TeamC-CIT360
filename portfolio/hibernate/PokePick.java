package Pokehib;

import Pokehib.PokeConnDB;
import Pokehib.Pokemonstarters;
import hibernatesandbox1.User;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.Query;

import java.util.Scanner;

public class PokePick {

	private List<Pokemonstarters> pokemons;
	Scanner userInput = new Scanner(System.in);
	
	public PokePick() {

	}

	public static void main(String[] args) {
		
		PokePick pickPokemon = new PokePick();
		pickPokemon.mainMenu();
		
	}
	
	private void mainMenu() {
		
		PokePick pickPokemon = new PokePick();
		Integer selection;
	
		System.out.println("Welcome to pokemon database system.");
		System.out.println("Pokemon are needed to travel for protection.");
		System.out.println("Lets find what is available to you.");
		// Put the thread to sleep for 2 seconds
		try {
			Thread.sleep(2000);
			}
		catch (InterruptedException ex) {
			// do nothing
			}
		pickPokemon.listPokemon();
		
		System.out.println("\nLets make sure none of these have been claimed.");
		// Put the thread to sleep for 2 seconds
		try {
			Thread.sleep(2000);
			}
		catch (InterruptedException ex) {
			// do nothing
			}
		pickPokemon.listJoinPokemon();
		
		System.out.println("\nLooks like there is a claimed one, lets remove it from the database.");
		// Put the thread to sleep for 2 seconds
		try {
			Thread.sleep(2000);
			}
		catch (InterruptedException ex) {
			// do nothing
			}
		pickPokemon.removePoke();
		
		System.out.println("\nProfessor Oak: Hello database I caught another Pikachu, Lets add it.");
		
		// Put the thread to sleep for 2 seconds
				try {
					Thread.sleep(2000);
					}
				catch (InterruptedException ex) {
					// do nothing
					}
		
		System.out.println("\nAdding Pikachu to database");
		
		pickPokemon.addPoke();
		
		System.out.println("\nProfessor Oak: Lets change Charmaders name, how about FlameMaster?");
		System.out.println("Changing Charmander to FlameMaster");
		// Put the thread to sleep for 2 seconds
		try {
			Thread.sleep(2000);
			}
		catch (InterruptedException ex) {
			// do nothing
			}
		pickPokemon.updateName();
		
		System.out.println("Have a nice day.");
		System.exit(0);
	}
	private void addPoke() {
		Session session = PokeConnDB.getSessionFactory().getCurrentSession();
        /*
         * all database interactions in Hibernate are required to be inside a transaction.
         */
        Transaction transaction = session.beginTransaction();
        /*
         * create some User instances.
         */
        Pokemonstarters pokemon = new Pokemonstarters();
        pokemon.setpokemon_id(1);
        pokemon.setpokemon_name("Pikachu");
        pokemon.settype("Electric");
        
        /*
         * save each instance as a record in the database
         */
        session.save(pokemon);
        transaction.commit();
        /*
         * prove that the User instances were added to the database and that
         * the instances were each updated with a database generated id.
         */
        
        System.out.println(pokemon.getpokemon_name() + " has been added to the database");
	}
	private void removePoke(){
		Session session = PokeConnDB.getSessionFactory().getCurrentSession();
		Transaction transaction = session.beginTransaction();

		Query pokemoned = session.createQuery("SELECT p FROM Pokemonstarters AS p WHERE trainer_id is NOT NULL");

		pokemons = pokemoned.list();

        System.out.println("How many are to be deleted: " + pokemons.size());


		Iterator<Pokemonstarters> pokeList = pokemons.iterator();
		while(pokeList.hasNext()) {
			Pokemonstarters element = pokeList.next();
			System.out.println(element.getpokemon_name() + " will be deleted.");
		}
		
		Query removePoke = session.createQuery("DELETE Pokemonstarters WHERE trainer_id = :deletion");
		pokeList = pokemons.iterator();
		String poke_id;
		while(pokeList.hasNext()) {
			Pokemonstarters element = pokeList.next();
			System.out.println(element.getpokemon_name() + " has been deleted.");
			session.delete(pokemons.get(element.getpokemon_id() - 1));
			}
		transaction.commit();
		}
	
	private void updateName() {
		Session session = PokeConnDB.getSessionFactory().getCurrentSession();
		Transaction transaction = session.beginTransaction();

		Query pokemoned = session.createQuery("SELECT p FROM Pokemonstarters AS p WHERE p.pokemon_name = 'Charmander'");
		

		Pokemonstarters charm = (Pokemonstarters)pokemoned.uniqueResult();
		charm.setpokemon_name("FlameMaster");
		session.merge(charm);
		transaction.commit();

		System.out.println("Charmander's name is now " + charm.getpokemon_name());	
		
	
	}
	
	private void listPokemon() {
		Session session = PokeConnDB.getSessionFactory().getCurrentSession();
		Transaction transaction = session.beginTransaction();
		
		Query pokemoned = session.createQuery("SELECT p FROM Pokemonstarters AS p ORDER BY p.pokemon_id");

		pokemons = pokemoned.list();
		
        System.out.println("How many pokemon: "+ pokemons.size());

		System.out.println("");
		System.out.printf("%-16s%-16s%-20s\n","Pokemon", "Name", "type");
		System.out.println("------------    -----------     -------------");

		Iterator<Pokemonstarters> pokeList = pokemons.iterator();
		
		while(pokeList.hasNext()) {
			
			Pokemonstarters element = pokeList.next();
			System.out.println(element.outputString());
			
		}
		
		transaction.commit();
		
	}
	private void listJoinPokemon() {
		Session session = PokeConnDB.getSessionFactory().getCurrentSession();
		Transaction transaction = session.beginTransaction();

		Query pokemoned = session.createQuery("SELECT p FROM Pokemonstarters AS p WHERE trainer_id is NOT NULL");

		pokemons = pokemoned.list();

        System.out.println("How many are taken: "+ pokemons.size());

		System.out.println("");
		System.out.printf("%-16s%-16s%-20s\n","Pokemon", "Name", "trainer");
		System.out.println("------------    -----------     -------------");

		Iterator<Pokemonstarters> pokeList = pokemons.iterator();
		
		while(pokeList.hasNext()) {
			
			Pokemonstarters element = pokeList.next();
			System.out.println(element.outputJoinString());
		}
		
		transaction.commit();
		
	}		
}
