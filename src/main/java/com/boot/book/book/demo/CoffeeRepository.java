package com.boot.book.book.demo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

@Repository
public interface CoffeeRepository extends CrudRepository<Coffee, String> {

}
