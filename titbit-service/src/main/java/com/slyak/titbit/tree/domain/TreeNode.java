package com.slyak.titbit.tree.domain;

import lombok.Data;
import org.springframework.data.jpa.domain.AbstractAuditable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Index;
import javax.persistence.Table;

/**
 * .
 *
 * @author stormning 2018/1/24
 * @since 1.3.0
 */
@Data
@Entity
@Table(name = "t_tree_node", indexes = {@Index(columnList = "treeId"), @Index(columnList = "pid")})
public class TreeNode extends AbstractAuditable<Long, Long> {

    private Long treeId;

    private Long pid;

    private String name;

    @Column(length = 1000)
    private String path;
}