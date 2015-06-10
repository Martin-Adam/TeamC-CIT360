package UnitOrder;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import Pokehib.PokeConnDB;
import Pokehib.Pokemonstarters;
import UnitOrder.Fireline;

public class GunTruck {
	private List<Mongoose> trucks;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GunTruck fireOrder = new GunTruck();
		fireOrder.menu();
	}

	private void menu(){
		GunTruck reOrder = new GunTruck();
		
		reOrder.listtrucks();
		
		reOrder.updatetrucks();
		
		reOrder.listtrucks();
		
		reOrder.RemoveTruck();
		
		reOrder.listtrucks();

		System.out.println("Building Database for re-run");

		reOrder.insertTruck();
		System.out.println("reentered deleted truck");

		
		reOrder.reupdatetrucks();
		System.out.println("reverted name change back to original input");

	}
	
	private void reupdatetrucks(){
		Session session = Fireline.getSessionFactory().getCurrentSession();
		Transaction movement = session.beginTransaction();

		Query correctedOrder = session.createQuery("Select m FROM Mongoose AS m Where Name='HQ313'");
		
		Mongoose fix = (Mongoose)correctedOrder.uniqueResult();
		fix.setName("H313");
		session.merge(fix);
		
		movement.commit();
	}

	private void insertTruck(){
		Session session = Fireline.getSessionFactory().getCurrentSession();
        Transaction transaction = session.beginTransaction();
        
        Mongoose adding = new Mongoose();
        adding.setMongoose_id(5);
        adding.setName("HQ405");
        adding.setWeapon("25MM");
        
        session.save(adding);
        transaction.commit();
        }


	private void RemoveTruck(){
		Session session = Fireline.getSessionFactory().getCurrentSession();
		Transaction transaction = session.beginTransaction();

		Query removeTruck = session.createQuery("DELETE FROM Mongoose WHERE Name='HQ405'");
		Iterator<Mongoose> truckList = trucks.iterator();
		System.out.println("has been deleted.");

		while(truckList.hasNext()) {
			System.out.println("has been deleted2.");

			Mongoose element = truckList.next();
			if(element.getName().equals("HQ405")){
			System.out.println(element.getName() + " has been deleted." + element.getMongoose_id());
			session.delete(trucks.get(4));//element.getMongoose_id()-1));
			}
		}
		transaction.commit();		
	}


	private void updatetrucks(){
		Session session = Fireline.getSessionFactory().getCurrentSession();
		Transaction movement = session.beginTransaction();

		Query correctedOrder = session.createQuery("Select m FROM Mongoose AS m Where Name='H313'");
		
		Mongoose fix = (Mongoose)correctedOrder.uniqueResult();
		fix.setName("HQ313");
		session.merge(fix);
		
		movement.commit();

		System.out.println("The firing roster has been corrected Sir");	
		
	
	}

	
	
	private void listtrucks(){
		Session session = Fireline.getSessionFactory().getCurrentSession();
		Transaction movement = session.beginTransaction();
		
		Query truck = session.createQuery("SELECT m FROM Mongoose AS m ORDER BY m.Mongoose_id");

		trucks = truck.list();
		
        System.out.println("What is the order: "+ trucks.size());

		System.out.println("");
		System.out.printf("%-16s%-16s%-20s\n","Mongoose_id", "Name", "Weapon");
		System.out.println("------------    -----------     -------------");

		Iterator<Mongoose> firingorder = trucks.iterator();
		
		while(firingorder.hasNext()) {
			
			Mongoose element = firingorder.next();
			System.out.println(element.outputString());
			
		}
		
		movement.commit();
	}

}
