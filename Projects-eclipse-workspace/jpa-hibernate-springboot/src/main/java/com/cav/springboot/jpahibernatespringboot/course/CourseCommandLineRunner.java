package com.cav.springboot.jpahibernatespringboot.course;

import com.cav.springboot.jpahibernatespringboot.course.Course;
import com.cav.springboot.jpahibernatespringboot.course.jdbc.CourseJdbcRepository;
import com.cav.springboot.jpahibernatespringboot.course.jpa.CourseJpaRepository;
import com.cav.springboot.jpahibernatespringboot.course.springdatajpa.CourseSpringDataJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

    //@Autowired
    //private CourseJdbcRepository repository;

    //@Autowired
    //private CourseJpaRepository repository;

    @Autowired
    private CourseSpringDataJpaRepository repository;

    @Override
    public void run(String... args) throws Exception {

        //Using JdbcRepository

        //repository.insert(new Course(1, "Learn Spring", "CAV"));
        //repository.insert(new Course(2, "Learn JPA", "CAV"));
        //repository.insert(new Course(3, "Learn Hibernate", "CAV"));
        //repository.deleteById(3);
        //System.out.println(repository.findById(2));

        //Using JpaRepository

        repository.save(new Course(1, "Learn Spring", "CAV"));
        repository.save(new Course(2, "Learn JPA", "CAV"));
        repository.save(new Course(3, "Learn Hibernate", "CAV"));

        repository.deleteById(3l);

        System.out.println(repository.findById(2l));

        System.out.println(repository.findAll());

        System.out.println(repository.count());

        System.out.println(repository.findByAuthor("CAV"));

        System.out.println(repository.findByName("Learn JPA"));

    }
}
