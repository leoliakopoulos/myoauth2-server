package com.lt.myoauth2server.repository;

import com.lt.myoauth2server.entity.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppUserRepository extends JpaRepository<AppUser, String> {

}
