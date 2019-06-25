package com.qa.nbs.friends.business;

import java.util.List;
import java.util.Optional;

import com.qa.nbs.friends.domain.Friend;

public interface IFriendsservice {

	List<Friend> getFriend();

	void deleteFriend(Long id);

	Friend addFriend(Friend friend);

	Optional<Friend> findById(long id);

}