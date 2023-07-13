package com.Sky_Watch_App.SkyWatch.Repositories;

import com.Sky_Watch_App.SkyWatch.Entities.User;
import jakarta.persistence.Id;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository  extends CrudRepository<User, Integer> {


}
