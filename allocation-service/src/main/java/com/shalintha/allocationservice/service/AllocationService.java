package com.shalintha.allocationservice.service;

import com.shalintha.allocationservice.model.Allocation;

import java.util.List;

public interface AllocationService {
    List<Allocation> fetchAllAllocations();

    Allocation saveAllocation(Allocation allocation);

    Allocation getAllocationById(int id);

    List<Allocation> getAllByEmpId(int id);
}
