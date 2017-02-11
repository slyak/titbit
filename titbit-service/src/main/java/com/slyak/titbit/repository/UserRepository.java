package com.slyak.titbit.repository;

import com.slyak.titbit.domain.User;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

/**
 * .
 *
 * @author stormning on 2017/2/10.
 */
public interface UserRepository extends ReactiveCrudRepository<User, Long> {
}
