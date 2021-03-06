package com.umasuo.datapoint.application.service.update;

import com.umasuo.datapoint.application.dto.action.ChangeOpenable;
import com.umasuo.datapoint.domain.model.DeviceDataDefinition;
import com.umasuo.datapoint.infrastructure.update.UpdateAction;
import com.umasuo.datapoint.infrastructure.update.UpdateActionUtils;
import com.umasuo.model.Updater;

import org.springframework.stereotype.Service;

/**
 * Created by Davis on 17/6/19.
 */
@Service(UpdateActionUtils.CHANGE_OPENABLE)
public class ChangeOpenableService implements Updater<DeviceDataDefinition, UpdateAction>{

  /**
   * Change DeviceDataDefinition openable.
   *
   * @param dataDefinition the DeviceDataDefinition
   * @param updateAction the update action
   */
  @Override
  public void handle(DeviceDataDefinition dataDefinition, UpdateAction updateAction) {
    ChangeOpenable action = (ChangeOpenable) updateAction;
    Boolean openable = action.getOpenable();

    dataDefinition.setOpenable(openable);

  }
}
