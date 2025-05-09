package com.rohitpatra.billingsoftware.service;

import com.razorpay.RazorpayException;
import com.rohitpatra.billingsoftware.io.RazorpayOrderResponse;

public interface RazorpayService {

    RazorpayOrderResponse createOrder(Double amount, String currency) throws RazorpayException;
}
