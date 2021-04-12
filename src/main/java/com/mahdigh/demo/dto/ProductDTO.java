package com.mahdigh.demo.dto;

import java.io.Serializable;
import java.util.List;

/**
 * @author Mahdi Ghazimoradi
 * @since 4/12/2021
 */

public class ProductDTO implements Serializable {

    private static final long serialVersionUID = 8722224622814538990L;

    private String productName;

    private Integer productCode;

    private String productDetails;

    private String productPicture;

    private Boolean enabledComment;

    private Boolean enabledPublicComment;

    private Boolean enabledVote;

    private Boolean enabledPublicVote;

    private String providerName;

    private Integer providerCode;

    private String providerLogo;

    private List<CommentDTO> comments;

    private Float averageOfVotes;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getProductCode() {
        return productCode;
    }

    public void setProductCode(Integer productCode) {
        this.productCode = productCode;
    }

    public String getProductDetails() {
        return productDetails;
    }

    public void setProductDetails(String productDetails) {
        this.productDetails = productDetails;
    }

    public String getProductPicture() {
        return productPicture;
    }

    public void setProductPicture(String productPicture) {
        this.productPicture = productPicture;
    }

    public Boolean getEnabledComment() {
        return enabledComment;
    }

    public void setEnabledComment(Boolean enabledComment) {
        this.enabledComment = enabledComment;
    }

    public Boolean getEnabledPublicComment() {
        return enabledPublicComment;
    }

    public void setEnabledPublicComment(Boolean enabledPublicComment) {
        this.enabledPublicComment = enabledPublicComment;
    }

    public Boolean getEnabledVote() {
        return enabledVote;
    }

    public void setEnabledVote(Boolean enabledVote) {
        this.enabledVote = enabledVote;
    }

    public Boolean getEnabledPublicVote() {
        return enabledPublicVote;
    }

    public void setEnabledPublicVote(Boolean enabledPublicVote) {
        this.enabledPublicVote = enabledPublicVote;
    }

    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    public Integer getProviderCode() {
        return providerCode;
    }

    public void setProviderCode(Integer providerCode) {
        this.providerCode = providerCode;
    }

    public String getProviderLogo() {
        return providerLogo;
    }

    public void setProviderLogo(String providerLogo) {
        this.providerLogo = providerLogo;
    }

    public List<CommentDTO> getComments() {
        return comments;
    }

    public void setComments(List<CommentDTO> comments) {
        this.comments = comments;
    }

    public Float getAverageOfVotes() {
        return averageOfVotes;
    }

    public void setAverageOfVotes(Float averageOfVotes) {
        this.averageOfVotes = averageOfVotes;
    }
}
