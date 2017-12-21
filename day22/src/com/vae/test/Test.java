package com.vae.test;

import com.vae.dao.PersonDao;
import com.vae.dao.PersonDaoImpl;
import com.vae.domain.Person;

import java.sql.SQLException;
import java.util.List;

public class Test {

     public static void main(String[] args) throws SQLException {
         PersonDao dao = new PersonDaoImpl();
         //dao.add(new Person("叶沛颖",24,"雄心壮阔"));

         //dao.update(new Person(1,"刘备",43,"我是通过Java命令而修改的记录"));

         //dao.delete(5);

         //Person p = dao.findById(1);
         //System.out.println(p);

         List<Person> persons = dao.findAll();

         for (Person person : persons) {
             System.out.println(person);
         }

         long count = dao.personCount();
         System.out.println(count);
     }

 }
