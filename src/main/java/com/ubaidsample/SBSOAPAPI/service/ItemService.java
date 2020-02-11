package com.ubaidsample.SBSOAPAPI.service;

import ubaidsample.generated.ItemRequest;
import ubaidsample.generated.ItemResponse;
import org.springframework.stereotype.Service;

@Service
public class ItemService {

    public ItemResponse getItem(ItemRequest itemRequest){
        ItemResponse itemResponse = new ItemResponse();
        itemResponse.setId(itemRequest.getId());
        itemResponse.setCategory("Sample Category_"+itemRequest.getId());
        itemResponse.setName("Sample ItemName_"+itemRequest.getId());
        return itemResponse;
    }
}