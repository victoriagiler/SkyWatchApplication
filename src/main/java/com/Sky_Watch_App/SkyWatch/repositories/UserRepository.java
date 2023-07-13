package com.Sky_Watch_App.SkyWatch.repositories;

import com.Sky_Watch_App.SkyWatch.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository  extends CrudRepository<User, Integer> {


}
