package Pokehib;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class PokeConnDB {
	
	private static final SessionFactory sessionFactory;
	static{
		Configuration config = new Configuration();
		config.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
		config.setProperty("hibernate.connection.driver_class", "com.mysql.jdbc.Driver");

		config.setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/pokestart");

		config.setProperty("hibernate.connection.username", "asher");
		config.setProperty("hibernate.connection.password", "pikachu25");

		config.setProperty("hibernate.connection.pool_size", "1");
		config.setProperty("hibernate.connection.autocommit", "true");
		config.setProperty("hibernate.cache.provider_class", "org.hibernate.cache.NoCacheProvider");

		config.setProperty("hibernate.show_sql", "false");
		config.setProperty("hibernate.transaction.factory_class", "org.hibernate.transaction.JDBCTransactionFactory");
		config.setProperty("hibernate.current_session_context_class", "thread");

		config.addAnnotatedClass(Pokemonstarters.class);
		config.addAnnotatedClass(PokePick.class);
		config.addAnnotatedClass(Trainer.class);
		

		ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();
		sessionFactory = config.buildSessionFactory(serviceRegistry);
	}
	
	public static SessionFactory getSessionFactory(){
		
		return sessionFactory;
		
	}

	private PokeConnDB() {
		
	}
}
