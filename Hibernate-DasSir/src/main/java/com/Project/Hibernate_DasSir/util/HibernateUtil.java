package com.Project.Hibernate_DasSir.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
public class HibernateUtil {

		public static StandardServiceRegistry registry = null;
		public static SessionFactory sesf=null;
		
		public static SessionFactory getsesf()
		{try {
			if(sesf==null)
			{
				registry= new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
				 
				MetadataSources source = new MetadataSources(registry);
				
				Metadata meta = source.getMetadataBuilder().build();
				
				sesf=meta.getSessionFactoryBuilder().build();
			}
		}
		
			catch(Exception e)
			{
				e.printStackTrace();
				if(registry!=null)
				{
					StandardServiceRegistryBuilder.destroy(registry);
				}
			}
		
			return sesf;
		}
}
