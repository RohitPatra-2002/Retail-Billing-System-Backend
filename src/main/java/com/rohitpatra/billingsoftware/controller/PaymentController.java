package com.rohitpatra.billingsoftware.controller;

import com.razorpay.RazorpayException;
import com.rohitpatra.billingsoftware.io.OrderResponse;
import com.rohitpatra.billingsoftware.io.PaymentRequest;
import com.rohitpatra.billingsoftware.io.PaymentVerificationRequest;
import com.rohitpatra.billingsoftware.io.RazorpayOrderResponse;
import com.rohitpatra.billingsoftware.service.OrderService;
import com.rohitpatra.billingsoftware.service.RazorpayService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payments")
@RequiredArgsConstructor
public class PaymentController {

    private final RazorpayService razorpayService;
    private final OrderService orderService;

    @PostMapping("/create-order")
    @ResponseStatus(HttpStatus.CREATED)
    public RazorpayOrderResponse createRazorpayOrder(@RequestBody PaymentRequest request) throws RazorpayException {
        return razorpayService.createOrder(request.getAmount(), request.getCurrency());
    }

    @PostMapping("/verify")
    public OrderResponse verifyPayment(@RequestBody PaymentVerificationRequest request) {
        return orderService.verifyPayment(request);
    }
}
