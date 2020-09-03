package ru.Sobolev.lesson20;

import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URL;

public class Testjson {

    public static void main(String[] args) throws IOException {
        String url = "https://api.publicapis.org/entries";
        URL jsonUrl = new URL(url);
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES, true);//игнорирует регистр json
        Response response = mapper.readValue(jsonUrl, Response.class);
//        System.out.println(response);
        System.out.println(response.getEntries().get(500));
    }

}
