package com.mahdigh.demo.dto;

import java.io.Serializable;

/**
 * @author Mahdi Ghazimoradi
 * @since 4/12/2021
 */

public class CommentsAndVotesDTO implements Serializable {

    private static final long serialVersionUID = 6032224622814538990L;

    private String comment;

    private String writerUsername;

    private Integer voteNumber;

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getWriterUsername() {
        return writerUsername;
    }

    public void setWriterUsername(String writerUsername) {
        this.writerUsername = writerUsername;
    }

    public Integer getVoteNumber() {
        return voteNumber;
    }

    public void setVoteNumber(Integer voteNumber) {
        this.voteNumber = voteNumber;
    }
}
