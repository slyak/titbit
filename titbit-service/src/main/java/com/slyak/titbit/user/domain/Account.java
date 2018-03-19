package com.slyak.titbit.user.domain;

import lombok.Data;
import org.springframework.data.jpa.domain.AbstractAuditable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * .
 *
 * @author stormning 2018/1/20
 * @since 1.3.0
 */
@Entity
@Table(name = "t_account")
@Data
public class Account extends AbstractAuditable<Long, Long> {

    private Long userId;

    @Column(name = "type0")
    private AccountType type;

    @Column(length = 1000)
    private String proof;

    private long expireAt = -1;
}
