package com.te.springmvcproject.Dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.stereotype.Repository;

import com.te.springmvcproject.beans.EmployeeBean;

@Repository
public class EmployeeHibernateDAOImpl implements EmployeeDAO {

	@Override
	public EmployeeBean authenticate(int id, String password) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("springDb");
		EntityManager entityManager=factory.createEntityManager();
		try {
			EmployeeBean bean = entityManager.find(EmployeeBean.class, id);
			if(bean!=null) {
				if(bean.getPassword().equals(password)) {
					System.out.println("succesfull login");
					return bean;
				}
				else {
					System.out.println("invalid password");
					return bean;
				}
			
			}else {
				System.out.println("invalid credentials");
				return bean;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(factory!=null) {
					factory.close();
				}
				if(entityManager!=null) {
					entityManager.close();
				}
			} catch (Exception e) {
				
				e.printStackTrace();
			}
		}
		return null;
	}

	@Override
	public EmployeeBean getEmployee(int id) {
		
		return null;
	}

}
