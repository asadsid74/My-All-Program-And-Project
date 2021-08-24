package com.sb.jpa;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.sb.jpa.dao.UserRepository;
import com.sb.jpa.model.User;

@SpringBootApplication
public class SpringBootDemo1Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootDemo1Application.class, args);
		UserRepository repository = context.getBean(UserRepository.class);
		// set the data
		/*
		 * User user = new User(); user.setName(" khan"); user.setCity("kanpur");
		 * user.setAddress("bijrapur");
		 * 
		 * User user1 = new User(); user1.setName("shubbham"); user1.setCity("pune");
		 * user1.setAddress("kondhawa");
		 */

//		User user4=new User();
//		user4.setName("deepak");
//		user4.setCity("lucknow");
//		user4.setAddress("millat nagar");
//		
		/*
		 * List<User> list = List.of(user, user1); Iterable<User> allresult =
		 * repository.saveAll(list);
		 */

//		for (User result : allresult) {
//			System.out.println(result);
//		}
//		
//		allresult.forEach(list1 ->{
//			System.out.println(list1);
//		});

		// User user2 = repository.save(user);
		// User user3 = repository.save(user1);
		// User user5 = repository.save(user4);

		// System.out.println(user2);
		// System.out.println(user3);
		// System.out.println(user5);

		// fetch the data by id from the db
//		Optional<User> id = repository.findById(13);
//		User user = id.get();
//		System.err.println(user);
		// fetch all data from the db
		// Iterable<User> all = repository.findAll();
//		System.out.println(all);

//		Iterator<User> iterator = all.iterator();
//		while (iterator.hasNext()) {
//			User user = (User) iterator.next();
//			System.err.println(user);
//			
//		}
//		System.out.println("__________________________________________________");
//		

//		for (User users : all) {
//			System.err.println(users);
//		}

//		all.forEach(data  ->{
//			System.out.println(data);
//		});

		// update the data
//		user.setAddress("shibli nagar");
//		User savedata = repository.save(user);
//		System.out.println(savedata);

		// System.out.println("user id"+ id);

		// delete the data by id from the db

//		repository.deleteById(7);
//		System.out.println("deleted successfully......");

		// delete all data

//		 Iterable<User> all = repository.findAll();
//		 System.err.println(all);
//		 
//		 all.forEach(System.out::println);
//		 repository.deleteAll(all);
//		 System.out.println("deleete");

		// custom method

		
		/*
		 * Iterable<User> byName = repository.findByName(" khan");
		 * byName.forEach(e->System.out.println(e)); System.err.println(byName);
		 */
		 

		/*
		 * Iterable<User> byNameAndCity =
		 * repository.findByNameAndCity(" khan","kanpur");
		 * byNameAndCity.forEach(data->System.out.println(data));
		 */
		
//		Iterable<User> nameLike = repository.findByNameLike(" khan");
//		System.err.println(nameLike);
		//u can use this method also but u have to defined in modelclass and interface repoalso
		
//		findByAgeLessThan
//		findByStartDateBetween
//		findByFirstname,findByFirstnameIs,findByFirstnameEquals
//		findByLastnameOrFirstname
//		findByLastnameAndFirstname
//		findDistinctByLastnameAndFirstname
//		findByAgeNotIn(Collection<Age> ages)
//		findByAgeIn(Collection<Age> ages)
//		findByActiveTrue()
//		findByFirstnameStartingWith
//		indByFirstnameNotLike
//		indByFirstnameNotLike
//		findByAge(Is)NotNull
//		
//		findByAge(Is)NotNull
//		
//		findByStartDateBefore
//		
//		findByStartDateBefore
		
		//another way
		
//		Iterable<User> allUser = repository.getAllUser();
//		allUser.forEach(al->System.out.println(al));
//		
		
//		Iterable<User> userName = repository.getAllUserName("shubbham");
//		userName.forEach(e->System.out.println(e));
		
		repository.getUsers().forEach(w->System.out.println(w));
		
	}

}
