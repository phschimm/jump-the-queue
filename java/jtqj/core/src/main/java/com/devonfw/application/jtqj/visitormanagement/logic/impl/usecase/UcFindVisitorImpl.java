package com.devonfw.application.jtqj.visitormanagement.logic.impl.usecase;

import java.util.Optional;

import javax.inject.Named;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

import com.devonfw.application.jtqj.visitormanagement.dataaccess.api.VisitorEntity;
import com.devonfw.application.jtqj.visitormanagement.logic.api.to.VisitorEto;
import com.devonfw.application.jtqj.visitormanagement.logic.api.to.VisitorSearchCriteriaTo;
import com.devonfw.application.jtqj.visitormanagement.logic.api.usecase.UcFindVisitor;
import com.devonfw.application.jtqj.visitormanagement.logic.base.usecase.AbstractVisitorUc;

/**
 * Use case implementation for searching, filtering and getting Visitors
 */
@Named
@Validated
@Transactional
public class UcFindVisitorImpl extends AbstractVisitorUc implements UcFindVisitor {

  /** Logger instance. */
  private static final Logger LOG = LoggerFactory.getLogger(UcFindVisitorImpl.class);

  private int a, b, c;

  @Override
  public VisitorEto findVisitor(long id) {

    // Complexity 6 <= x <= 10
    switch ((int) id) {
      case 1:
        LOG.debug("Case 1");
        break;
      case 2:
        LOG.debug("Case 2");
        break;
      case 3:
        LOG.debug("Case 3");
        break;
      case 4:
        LOG.debug("Case 4");
        break;
      case 5:
        LOG.debug("Case 5");
        break;
      case 6:
        LOG.debug("Case 6");
        break;
    }

    id = id < 1000 ? id : id;

    LOG.debug("Get Visitor with id {} from database.", id);
    Optional<VisitorEntity> foundEntity = getVisitorRepository().findById(id);
    if (foundEntity.isPresent())
      return getBeanMapper().map(foundEntity.get(), VisitorEto.class);
    else
      return null;
  }

  @Override
  public Page<VisitorEto> findVisitors(VisitorSearchCriteriaTo criteria) {

    // Complexity 1 <= x <= 5
    if (this.a > this.b) {
      LOG.debug("Test");
    } else if (this.b > this.c) {
      LOG.debug("Test");
    } else if (this.c > this.a) {
      LOG.debug("Test");
    }

    Page<VisitorEntity> visitors = getVisitorRepository().findByCriteria(criteria);
    return mapPaginatedEntityList(visitors, VisitorEto.class);
  }

}
