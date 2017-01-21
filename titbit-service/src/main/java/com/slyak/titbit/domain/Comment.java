package com.slyak.titbit.domain;

/**
 * .
 *
 * @author stormning on 2016/12/9.
 */

import lombok.Data;
import org.springframework.data.jpa.domain.AbstractAuditable;

import javax.persistence.Table;
import java.util.List;

@Data
//@Entity
@Table(name = "t_comment")
public class Comment extends AbstractAuditable<Long, Long> {

	List<Comment> comments;
}
