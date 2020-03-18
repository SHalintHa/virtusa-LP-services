package com.shalintha.allocationservice.controller;

import com.shalintha.allocationservice.model.Allocation;
import com.shalintha.allocationservice.repository.AllocationRepository;
import com.shalintha.allocationservice.service.AllocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AllocationController {
    @Autowired
    AllocationService allocationService;

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public Allocation saveAllocation(@RequestBody Allocation allocation) {
        return allocationService.saveAllocation(allocation);
    }

    @RequestMapping(value = "/allocation/{id}")
    public Allocation findById(@PathVariable int id) {
        return allocationService.getAllocationById(id);
    }

    @RequestMapping(value = "/employee/{id}")
    public List<Allocation> findByEmpId(@PathVariable int id) {
        return allocationService.getAllByEmpId(id);
    }
}
