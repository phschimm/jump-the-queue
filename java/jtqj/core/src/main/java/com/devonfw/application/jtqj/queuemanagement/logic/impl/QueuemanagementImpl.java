package com.devonfw.application.jtqj.queuemanagement.logic.impl;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.data.domain.Page;

import com.devonfw.application.jtqj.general.logic.base.AbstractComponentFacade;
import com.devonfw.application.jtqj.queuemanagement.logic.api.Queuemanagement;
import com.devonfw.application.jtqj.queuemanagement.logic.api.to.QueueEto;
import com.devonfw.application.jtqj.queuemanagement.logic.api.to.QueueSearchCriteriaTo;
import com.devonfw.application.jtqj.queuemanagement.logic.api.usecase.UcFindQueue;
import com.devonfw.application.jtqj.queuemanagement.logic.api.usecase.UcManageQueue;

/**
 * Implementation of component interface of queuemanagement
 */
@Named
public class QueuemanagementImpl extends AbstractComponentFacade implements Queuemanagement {

  @Inject
  private UcFindQueue ucFindQueue;

  @Inject
  private UcManageQueue ucManageQueue;

  private int a, b, c, d;

  @Override
  public QueueEto findQueue(long id) {

    // Complexity 11 <= x <= 25
    if (this.a > this.b && this.b > this.c && this.c > this.d) {
    } else if (this.d > this.c || this.c > this.b || this.b > this.a) {
    } else if (this.a == this.b || this.b == this.c && this.c == this.d) {
    } else if (this.a == this.b && this.b == this.c || this.c == this.d) {
    } else if (this.a >= this.b && this.b >= this.c && this.c > this.d) {
    }

    return this.ucFindQueue.findQueue(id);
  }

  @Override
  public Page<QueueEto> findQueues(QueueSearchCriteriaTo criteria) {

    return this.ucFindQueue.findQueues(criteria);
  }

  @Override
  public QueueEto saveQueue(QueueEto queue) {

    return this.ucManageQueue.saveQueue(queue);
  }

  @Override
  public boolean deleteQueue(long id) {

    return this.ucManageQueue.deleteQueue(id);
  }
}
