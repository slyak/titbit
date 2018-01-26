package com.slyak.titbit.user.domain;

import lombok.Data;
import org.springframework.data.jpa.domain.AbstractAuditable;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * .
 *
 * @author stormning 2018/1/20
 * @since 1.3.0
 */
@Entity
@Table(name = "t_user")
@Data
public class User extends AbstractAuditable<Long, Long> {

    private String name;

}
