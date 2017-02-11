package com.slyak.titbit.web;

import com.slyak.titbit.domain.User;
import com.slyak.titbit.repository.UserRepository;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscription;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.BaseSubscriber;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.function.Predicate;

/**
 * .
 *
 * @author stormning on 2017/2/10.
 */
@RestController
public class TestController {

	@Autowired
	private UserRepository userRepository;

	@GetMapping("/saveUser")
	Mono<Void> test(){
		User user = new User();
		user.setName("hello world");
		return userRepository.save(user).then();
	}

	@PostMapping("/user")
	Mono<Void> create(@RequestBody Publisher<User> userStream) {
		return this.userRepository.save(userStream).then();
	}

	@GetMapping("/user")
	Flux<User> list() {
		return this.userRepository.findAll();
	}

	@GetMapping("/user/{id}")
	Mono<User> findById(@PathVariable Long id) {
		return this.userRepository.findOne(id);
	}

	public static void main(String[] args) {
		Flux<String> just = Flux.just("aaa", "bbb", "cccc");
		just.subscribe(new BaseSubscriber<String>() {
			@Override
			protected void hookOnSubscribe(Subscription subscription) {
				System.out.println("hell");
			}

			@Override
			protected void hookOnNext(String s) {
				System.out.println("nnn");
			}
		});
		just.filter(new Predicate<String>() {
			@Override
			public boolean test(String s) {
				return s.startsWith("a");
			}
		}).last();
	}
}