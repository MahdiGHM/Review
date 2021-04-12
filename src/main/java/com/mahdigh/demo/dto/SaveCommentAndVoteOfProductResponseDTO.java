package com.mahdigh.demo.dto;

import java.io.Serializable;

/**
 * @author Mahdi Ghazimoradi
 * @since 4/12/2021
 */

public class SaveCommentAndVoteOfProductResponseDTO implements Serializable {

    private static final long serialVersionUID = 3231224622814538990L;

    private String responseMessage;

    public String getResponseMessage() {
        return responseMessage;
    }

    public void setResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }
}
