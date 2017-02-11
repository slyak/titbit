package com.slyak.titbit.domain;

/**
 * .
 *
 * @author stormning on 2016/12/9.
 */

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document
public class Comment {
	List<Comment> comments;
}
