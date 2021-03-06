package com.consultpedia.service;

import com.consultpedia.entity.ProductInOrder;
import com.consultpedia.entity.User;

/**
 * Created By Zhu Lin on 1/3/2019.
 */
public interface ProductInOrderService {
    void update(String itemId, Integer quantity, User user);
    ProductInOrder findOne(String itemId, User user);
}
