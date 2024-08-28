package com.mongo.mongo.repository;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.mongo.mongo.model.GroceryItem;

@Repository
public interface ItemRepository extends MongoRepository<GroceryItem,String>{

}
