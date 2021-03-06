package homework.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import homework.dataAccess.abstracts.UserDao;
import homework.entities.concretes.User;

public class HibernateUserDao implements UserDao {

	@Override
	public void add(User user) {
		System.out.println("Kullanıcı veri tabanına eklendi");
		
	}

	@Override
	public void delete(User user) {
		System.out.println("Kullanıcı veri tabanından silindi");
		
	}

	@Override
	public void update(User user) {
		System.out.println("Kullanıcı güncellendi");
		
	}

	@Override
	public List<User> getAll() {
		User admin = new User (1,"TALHA","KOCA","talha@talha","12345", null, null); 
		User member = new User(2,"Talha","Koca","talha@talha.com","12345", null, null);
		
		List<User> list = new ArrayList<User>();
		list.add(admin);
		list.add(member);
		return list;
	}

}
