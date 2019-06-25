package com.qa.nbs.friends.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qa.nbs.friends.domain.Friend;

@Repository
public interface FriendsRepository extends JpaRepository<Friend, Long> {
	
}
