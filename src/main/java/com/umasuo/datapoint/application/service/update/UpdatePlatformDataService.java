package com.umasuo.datapoint.application.service.update;

import com.umasuo.datapoint.application.dto.action.UpdateProductTypeData;
import com.umasuo.datapoint.domain.model.PlatformDataDefinition;
import com.umasuo.datapoint.infrastructure.update.UpdateAction;
import com.umasuo.datapoint.infrastructure.update.UpdateActionUtils;
import com.umasuo.datapoint.infrastructure.validator.SchemaValidator;
import com.umasuo.model.Updater;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * Update data definition service.
 */
@Service(UpdateActionUtils.UPDATE_PRODUCT_TYPE_DATA)
public class UpdatePlatformDataService implements Updater<PlatformDataDefinition, UpdateAction> {

  /**
   * Logger.
   */
  private static final Logger LOGGER = LoggerFactory.getLogger(SetSchemaService.class);

  /**
   * Update data definition.
   */
  @Override
  public void handle(PlatformDataDefinition dataDefinition, UpdateAction updateAction) {
    LOGGER.debug("Enter.");

    UpdateProductTypeData action = (UpdateProductTypeData) updateAction;

    String schema = action.getSchema();

    SchemaValidator.validate(schema);

    dataDefinition.setDataSchema(schema);
    dataDefinition.setDescription(action.getDescription());
    dataDefinition.setName(action.getName());

    LOGGER.debug("Exit.");
  }
}