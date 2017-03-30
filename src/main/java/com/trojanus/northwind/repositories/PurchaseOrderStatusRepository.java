package com.trojanus.northwind.repositories;

import com.trojanus.northwind.model.PurchaseOrderStatus;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by John on 3/30/2017.
 */
public interface PurchaseOrderStatusRepository extends CrudRepository<PurchaseOrderStatus, Long> {
}
