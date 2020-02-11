package com.ubaidsample.SBSOAPAPI.endpoint;

import ubaidsample.generated.ItemRequest;
import ubaidsample.generated.ItemResponse;
import com.ubaidsample.SBSOAPAPI.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class ItemEndPoint {
    private static final String NAME_SPACE = "ubaidsample/generated";
    @Autowired
    ItemService itemService;

    @PayloadRoot(namespace = NAME_SPACE, localPart = "ItemRequest")
    @ResponsePayload
    public ItemResponse getItems(@RequestPayload ItemRequest itemRequest){
        return itemService.getItem(itemRequest);
    }
}