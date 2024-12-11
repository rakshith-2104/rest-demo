package com.restprojectcrud.rest_demo.controller;

import com.restprojectcrud.rest_demo.model.CloudVendor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorAPIService {

    CloudVendor cloudVendor;
    @GetMapping("{vendorId}")
    public CloudVendor gCloudVendorDetails(String vendorId){
        return new CloudVendor("C1","Vendor 1",
                "VendorAddress 1", "xxx555");
    }

}
