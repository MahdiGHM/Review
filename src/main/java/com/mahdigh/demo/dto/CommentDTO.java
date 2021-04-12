package com.mahdigh.demo.dto;

import java.io.Serializable;

/**
 * @author Mahdi Ghazimoradi
 * @since 4/12/2021
 */

public class CommentDTO implements Serializable {

    private static final long serialVersionUID = 2233224622814538990L;

    private String content;

    private String writerUsername;

    public CommentDTO() {
    }

    public CommentDTO(String content, String writerUsername) {
        this.content = content;
        this.writerUsername = writerUsername;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getWriterUsername() {
        return writerUsername;
    }

    public void setWriterUsername(String writerUsername) {
        this.writerUsername = writerUsername;
    }
}
