package com.trojanus.northwind.repositories;

import com.trojanus.northwind.model.PurchaseOrders;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by John on 3/30/2017.
 */
public interface PurchaseOrdersRepository extends CrudRepository<PurchaseOrders, Long> {
}
