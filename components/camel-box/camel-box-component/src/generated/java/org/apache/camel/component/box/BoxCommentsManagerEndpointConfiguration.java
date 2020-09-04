
/*
 * Camel EndpointConfiguration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.box;

import org.apache.camel.spi.Configurer;
import org.apache.camel.spi.ApiParams;
import org.apache.camel.spi.UriParam;
import org.apache.camel.spi.UriParams;

/**
 * Camel EndpointConfiguration for org.apache.camel.component.box.api.BoxCommentsManager
 */
@ApiParams(apiName = "comments", apiMethods = "addFileComment,changeCommentMessage,deleteComment,getCommentInfo,getFileComments,replyToComment")
@UriParams
@Configurer
public final class BoxCommentsManagerEndpointConfiguration extends BoxConfiguration {
    @UriParam(description = "The id of comment to change")
    private String commentId;
    @UriParam(description = "The id of file to rename")
    private String fileId;
    @UriParam(description = "The comment's message")
    private String message;

    public String getCommentId() {
        return commentId;
    }

    public void setCommentId(String commentId) {
        this.commentId = commentId;
    }

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
