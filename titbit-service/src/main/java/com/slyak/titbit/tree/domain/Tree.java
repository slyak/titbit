package com.slyak.titbit.tree.domain;

import lombok.Data;
import org.springframework.data.jpa.domain.AbstractAuditable;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * .
 *
 * @author stormning 2018/1/24
 * @since 1.3.0
 */
@Data
@Entity
@Table(name = "t_tree_node")
public class Tree extends AbstractAuditable<Long, Long> {

    private String name;

    private String description;
}