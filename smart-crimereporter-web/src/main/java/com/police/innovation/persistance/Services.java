package com.police.innovation.persistance;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.police.innovation.model.DialogueResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;


@Service
public class Services {
    Logger LOG = LoggerFactory.getLogger(this.getClass().getName());
    private RestTemplate restTemplate = new RestTemplate();

    public HashMap getIntents(String description){

        String url = "https://api.api.ai/v1/query?v=20150910&sessionId=01&query=" + description;
        HttpEntity httpEntity = new HttpEntity("", getHttpHeaders());
        ResponseEntity<DialogueResponse> response = restTemplate.exchange("https://api.api.ai/v1/query?v=20150910&query=" + description + "&lang=en-GB&sessionId=01", HttpMethod.GET, httpEntity, DialogueResponse.class);
        DialogueResponse rs = response.getBody();


        LOG.info("Weapon-Type : " + rs.getResult().getParameters().get("weapon-type").toString());
        LOG.info("attacker-type : " + rs.getResult().getParameters().get("weapon-type").toString());

        return rs.getResult().getParameters();
    }

    private HttpHeaders getHttpHeaders() {
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add(HttpHeaders.AUTHORIZATION, "Bearer 8933675d075f49f39ec08be3afdeb2a4");

        return httpHeaders;
    }


}
