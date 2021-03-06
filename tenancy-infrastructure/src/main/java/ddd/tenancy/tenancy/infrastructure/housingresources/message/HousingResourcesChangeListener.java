package ddd.tenancy.tenancy.infrastructure.housingresources.message;

import com.google.common.eventbus.Subscribe;

import ddd.base.domain.EventListenerI;
import ddd.tenancy.tenancy.domain.core.event.HousingResourcesChangeEvent;
import lombok.extern.slf4j.Slf4j;

import org.springframework.stereotype.Component;

/**
 * HousingResourcesChangeListener
 * 1：监听事务有无提交
 * 2：我应该发送多少内容出去
 * date Jun 4, 2019 12:44:25 PM
 */
@Slf4j
@Component
public class HousingResourcesChangeListener implements EventListenerI<HousingResourcesChangeEvent> {

  @Subscribe
  @Override
  public void execute(HousingResourcesChangeEvent event) {
    log.info("something is run");
    log.info("something is run444");
  }

}
