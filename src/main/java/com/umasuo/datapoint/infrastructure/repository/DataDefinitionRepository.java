package com.umasuo.datapoint.infrastructure.repository;

import com.umasuo.datapoint.domain.model.DeviceDataDefinition;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by umasuo on 17/2/10.
 */
@Repository
public interface DataDefinitionRepository extends JpaRepository<DeviceDataDefinition, String> {

}
