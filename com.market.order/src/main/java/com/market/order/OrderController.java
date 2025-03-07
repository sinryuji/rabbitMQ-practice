package com.market.order;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class OrderController {

    @GetMapping("/order/{id}")
    public String order(@PathVariable("id") String id) {

        return "Order Id: " + id;
    }
}
