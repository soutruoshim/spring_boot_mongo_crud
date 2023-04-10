package com.srhdp.crud_mongo.repo;

import com.srhdp.crud_mongo.entity.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends MongoRepository<Student,String> {
}
