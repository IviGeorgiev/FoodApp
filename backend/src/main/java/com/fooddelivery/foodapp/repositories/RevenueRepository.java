package com.fooddelivery.foodapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface RevenueRepository extends JpaRepository<Object, Long> {

    @Query("SELECT SUM(o.totalPrice) FROM Order o")
    Double findTotalRevenue();

    @Query("SELECT SUM(o.totalPrice) FROM Order o WHERE o.supplier.id = :supplierId")
    Double findRevenueBySupplierId(Long supplierId);
}
