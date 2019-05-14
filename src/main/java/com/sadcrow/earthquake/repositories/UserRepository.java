package com.sadcrow.earthquake.repositories;

import com.sadcrow.earthquake.entities.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
}
