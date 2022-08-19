package com.travel.tapscabs.dao;

import com.travel.tapscabs.model.CabDetails;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @implNote Interface to communicate cab details with DB.
 * @author Sanyog Varshney
 * @version 1.0
 */
public interface ICabDetailsDao extends JpaRepository<CabDetails, String> {

}
