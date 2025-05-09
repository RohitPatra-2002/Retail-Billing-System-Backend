package com.rohitpatra.billingsoftware.service;

import com.rohitpatra.billingsoftware.io.OrderRequest;
import com.rohitpatra.billingsoftware.io.OrderResponse;
import com.rohitpatra.billingsoftware.io.PaymentVerificationRequest;

import java.time.LocalDate;
import java.util.List;

public interface OrderService {

    OrderResponse createOrder(OrderRequest request);

    void deleteOrder(String orderId);

    List<OrderResponse> getLatestOrders();

    OrderResponse verifyPayment(PaymentVerificationRequest request);

    Double sumSalesByDate(LocalDate date);

    Long countByOrderDate(LocalDate date);

    List<OrderResponse> findRecentOrders();
}
