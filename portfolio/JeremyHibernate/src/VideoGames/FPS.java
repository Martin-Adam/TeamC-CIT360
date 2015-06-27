package VideoGames;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import VideoGames.RPG;
import VideoGames.TestConn;

public class FPS {
	private List<RPG> games;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FPS testOrder = new FPS();
		testOrder.menu();
	}

	private void menu(){
		FPS reOrder = new FPS();
		
		reOrder.listgames();
		
		reOrder.updategames();
		
		reOrder.listgames();
		
		reOrder.RemoveGame();
		
		reOrder.listgames();

		System.out.println("Building Database for re-run");

		reOrder.insertGame();
		System.out.println("reentered deleted game");

		
		reOrder.reupdategames();
		System.out.println("reverted name change back to original input");

	}
	
	private void reupdategames(){
		Session session = TestConn.getSessionFactory().getCurrentSession();
		Transaction movement = session.beginTransaction();

		Query correctedOrder = session.createQuery("Select m FROM RPG AS m Where Name='Final Fantasy'");
		
		RPG fix = (RPG)correctedOrder.uniqueResult();
		fix.setName("Final Fantasy VII");
		session.merge(fix);
		
		movement.commit();
	}

	private void insertGame(){
		Session session = TestConn.getSessionFactory().getCurrentSession();
        Transaction transaction = session.beginTransaction();
        
        RPG adding = new RPG();
        adding.setRPG_id(5);
        adding.setName("Final Fantasy I");
        adding.setRating("Great");
        
        session.save(adding);
        transaction.commit();
        }


	private void RemoveGame(){
		Session session = TestConn.getSessionFactory().getCurrentSession();
		Transaction transaction = session.beginTransaction();

		Query removeGame = session.createQuery("DELETE FROM RPG WHERE Name='Chrono Cross'");
		Iterator<RPG> gameList = games.iterator();
		System.out.println("has been deleted.");

		while(gameList.hasNext()) {
			System.out.println("has been deleted2.");

			RPG element = gameList.next();
			if(element.getName().equals("Dragon Ball")){
			System.out.println(element.getName() + " has been deleted." + element.getRPG_id());
			session.delete(games.get(4));//element.getMongoose_id()-1));
			}
		}
		transaction.commit();		
	}


	private void updategames(){
		Session session = TestConn.getSessionFactory().getCurrentSession();
		Transaction movement = session.beginTransaction();

		Query correctedOrder = session.createQuery("Select m FROM RPG AS m Where Name='destiny'");
		
		RPG fix = (RPG)correctedOrder.uniqueResult();
		fix.setName("Destiny");
		session.merge(fix);
		
		movement.commit();

		System.out.println("The firing roster has been corrected Sir");	
		
	
	}

	
	
	private void listgames(){
		Session session = TestConn.getSessionFactory().getCurrentSession();
		Transaction movement = session.beginTransaction();
		
		Query game = session.createQuery("SELECT m FROM RPG AS m ORDER BY m.RPG_id");

		games = game.list();
		
        System.out.println("What is the order: "+ games.size());

		System.out.println("");
		System.out.printf("%-16s%-16s%-20s\n","RPG_id", "Name", "Rating");
		System.out.println("------------    -----------     -------------");

		Iterator<RPG> firingorder = games.iterator();
		
		while(firingorder.hasNext()) {
			
			RPG element = firingorder.next();
			System.out.println(element.outputString());
			
		}
		
		movement.commit();
	}

}
