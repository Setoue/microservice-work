package com.setoue.hrpayroll.services;

import com.setoue.hrpayroll.entities.Payment;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public Payment getPayment(long workerId, int days) {
        //mocked Payment
        return new Payment("Joao", 600.0, days);
    }
}