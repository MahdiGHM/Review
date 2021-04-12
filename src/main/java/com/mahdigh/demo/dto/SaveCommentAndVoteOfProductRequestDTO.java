package com.mahdigh.demo.dto;

import java.io.Serializable;

/**
 * @author Mahdi Ghazimoradi
 * @since 4/12/2021
 */

public class SaveCommentAndVoteOfProductRequestDTO implements Serializable {

    private static final long serialVersionUID = 3331224622814538990L;

    private String comment;

    private Integer vote;

    private String username;

    private Long productId;

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Integer getVote() {
        return vote;
    }

    public void setVote(Integer vote) {
        this.vote = vote;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }
}
