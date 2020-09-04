
/*
 * Camel EndpointConfiguration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.braintree;

import org.apache.camel.spi.Configurer;
import org.apache.camel.spi.ApiParams;
import org.apache.camel.spi.UriParam;
import org.apache.camel.spi.UriParams;

/**
 * Camel EndpointConfiguration for com.braintreegateway.WebhookNotificationGateway
 */
@ApiParams(apiName = "webhookNotification", apiMethods = "parse,verify")
@UriParams
@Configurer
public final class WebhookNotificationGatewayEndpointConfiguration extends BraintreeConfiguration {
    @UriParam
    private String challenge;
    @UriParam
    private String payload;
    @UriParam
    private String signature;

    public String getChallenge() {
        return challenge;
    }

    public void setChallenge(String challenge) {
        this.challenge = challenge;
    }

    public String getPayload() {
        return payload;
    }

    public void setPayload(String payload) {
        this.payload = payload;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }
}
