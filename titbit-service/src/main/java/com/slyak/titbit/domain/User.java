package com.slyak.titbit.domain;

import lombok.Data;
import org.springframework.data.jpa.domain.AbstractAuditable;

import javax.persistence.Table;

/**
 * .
 *
 * @author stormning on 2016/12/9.
 */
@Data
//@Entity
@Table(name = "t_user")
public class User extends AbstractAuditable<Long, Long> {

}
