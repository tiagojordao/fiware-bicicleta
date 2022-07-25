package com.fiwarenotify;

import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("subscribe")
public class FiwareNotifyController {

    @GetMapping
    public void isRunning() {
        System.out.println("Running!");
    }
    @PostMapping
    public void showNotify(@RequestBody JsonNode req) {
        System.out.println(req.toPrettyString());
    }
}
