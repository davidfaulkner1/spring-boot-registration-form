package com.davidfaulkner.registration.spring_boot_registration_form.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.davidfaulkner.registration.spring_boot_registration_form.entity.CustomerData;

/**
 * @author david
 *
 */
@Repository
public interface CustomerDataRepository extends JpaRepository<CustomerData, Long> {

}
