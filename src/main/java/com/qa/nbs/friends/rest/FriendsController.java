package com.qa.nbs.friends.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.qa.nbs.friends.business.IFriendsservice;
import com.qa.nbs.friends.constants.Constants;
import com.qa.nbs.friends.domain.Friend;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class FriendsController {

	@Autowired
	private IFriendsservice FriendsService;

	@GetMapping(path = Constants.FRIENDS)
	public ResponseEntity<List<Friend>> getFriends() {
		return ResponseEntity.ok(FriendsService.getFriend());
	}
	
	@RequestMapping(value = Constants.FRIENDS, method = RequestMethod.POST)
	public ResponseEntity<Friend> postFriends(@RequestBody Friend friend) {
		return ResponseEntity.ok(FriendsService.addFriend(friend));
	}

	@RequestMapping(value = Constants.FRIENDS_WITH_PARAM, method = RequestMethod.DELETE)
	public ResponseEntity<List<Friend>> deleteTodo(@PathVariable("id") long id) {
		if (!FriendsService.findById(id).isPresent()) {
			return ResponseEntity.badRequest().build();
		}
		FriendsService.deleteFriend(id);
		return ResponseEntity.ok(FriendsService.getFriend());
	}



}