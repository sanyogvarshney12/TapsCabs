package com.travel.tapscabs.dao;

import com.travel.tapscabs.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressDao extends JpaRepository<Address, Integer> {
}
