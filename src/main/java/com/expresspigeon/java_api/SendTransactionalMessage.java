package com.expresspigeon.java_api;

import org.javalite.common.Util;
import org.javalite.http.Http;
import org.javalite.http.Post;

/**
 * Sends a single transactional email via REST API service.
 */
public class SendTransactionalMessage {
    public static void main(String[] args) {

        String json = Util.readResource("/transactional.json");
        Post p = Http.post("https://api.expresspigeon.com/messages", json)
                .header("Content-type", "application/json")
                .header("X-auth-key", "XXXXXXXX-XXXX-XXXX-XXXX-XXXXXXXXXXX");
        System.out.println(p.text());
    }
}
