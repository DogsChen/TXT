package com.wxs.Facatory;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.json.JsonMapper;

public class ObjectMapperFacatory {
    public static JsonMapper JSON = new JsonMapper();
    public static ObjectMapper objectMapper = new ObjectMapper();

}
