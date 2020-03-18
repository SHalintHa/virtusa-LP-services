package com.shalintha.allocationservice.service;

import com.shalintha.allocationservice.model.Allocation;
import com.shalintha.allocationservice.repository.AllocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AllocationServiceImpl implements AllocationService {

    @Autowired
    AllocationRepository allocationRepository;

    @Override
    public List<Allocation> fetchAllAllocations() {
        return allocationRepository.findAll();
    }

    @Override
    public Allocation saveAllocation(Allocation allocation) {
        return allocationRepository.save(allocation);
    }

    @Override
    public Allocation getAllocationById(int id) {
        Optional<Allocation> optional = allocationRepository.findById(id);
        if(optional.isPresent()) {
            return optional.get();
        }
        return null;
    }

    @Override
    public List<Allocation> getAllByEmpId(int id) {
        return allocationRepository.findAllByEmpId(id);
    }


}
