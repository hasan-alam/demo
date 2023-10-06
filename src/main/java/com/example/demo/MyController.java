package com.example.demo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MyController {
	@Autowired
	MyBean bean;
	
	@GetMapping("/hello")
	public String getMethod() {
		bean.printHello();
		System.out.println("Get Called");
		bean=null;
		return "Success";
	}
	
	@RequestMapping("/eod-email")
	public ResponseEntity<Object> generateEODEmail(@RequestBody(required = false) Map<String, Object> payload)
    {
		System.out.println("API called from java");
		HashMap replyMap = new HashMap<String, Object>();
        if (payload == null)
        {
            replyMap.put("success", false);
            replyMap.put("reason", "Empty payload");
        }
        else
        {
            if (payload.containsKey("emailRecipient") && payload.containsKey("emailBody"))
            {
                System.out.println("Email Recipient:"+payload.get("emailRecipient").toString());
                System.out.println("Email Body:"+payload.get("emailRecipient").toString());
                replyMap.put("success", true);
                replyMap.put("reason", "Paylod found");
            }
            else
            {
                replyMap.put("success", false);
                replyMap.put("reason", "One or More Missing payload");
            }
        }
        return new ResponseEntity<>(replyMap, HttpStatus.OK);
    }

}
