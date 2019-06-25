package com.qa.nbs.friends.business;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qa.nbs.friends.domain.Friend;
import com.qa.nbs.friends.persistence.FriendsRepository;

@Service
public class FriendsService implements IFriendsservice {
	
	@Autowired
	private FriendsRepository FriendsRepository;
	
	public List<Friend> getFriend() {
		return FriendsRepository.findAll();
	}

	public void deleteFriend(Long id) {
		FriendsRepository.deleteById(id);
		
	}
	
	public Optional<Friend> findById(long id) {
		return FriendsRepository.findById(id);
	}

	public Friend addFriend(Friend friend) {
		return FriendsRepository.save(friend);
		}
}

