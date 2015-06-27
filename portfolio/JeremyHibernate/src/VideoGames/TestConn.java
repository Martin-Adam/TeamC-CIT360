package VideoGames;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class TestConn {
	
	private static final SessionFactory sessionFactory;
	static{
		Configuration config = new Configuration();
		config.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
		config.setProperty("hibernate.connection.driver_class", "com.mysql.jdbc.Driver");

		config.setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/video_games");

		config.setProperty("hibernate.connection.username", "mario");
		config.setProperty("hibernate.connection.password", "kart");

		config.setProperty("hibernate.connection.pool_size", "1");
		config.setProperty("hibernate.connection.autocommit", "true");
		config.setProperty("hibernate.cache.provider_class", "org.hibernate.cache.NoCacheProvider");

		config.setProperty("hibernate.show_sql", "false");
		config.setProperty("hibernate.transaction.factory_class", "org.hibernate.transaction.JDBCTransactionFactory");
		config.setProperty("hibernate.current_session_context_class", "thread");

		config.addAnnotatedClass(FPS.class);
		config.addAnnotatedClass(RPG.class);
		

		ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();
		sessionFactory = config.buildSessionFactory(serviceRegistry);
	}
	
	public static SessionFactory getSessionFactory(){
		
		return sessionFactory;
		
	}

	private TestConn() {
		
	}
}
