package com.devonfw.application.jtqj.visitormanagement.logic.impl;

import javax.inject.Inject;

import org.junit.Ignore;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import com.devonfw.application.jtqj.SpringBootApp;
import com.devonfw.application.jtqj.visitormanagement.logic.api.Visitormanagement;
import com.devonfw.application.jtqj.visitormanagement.logic.api.to.VisitorEto;
import com.devonfw.application.jtqj.visitormanagement.logic.api.to.VisitorSearchCriteriaTo;
import com.devonfw.module.test.common.base.ComponentTest;

@SpringBootTest(classes = SpringBootApp.class)
public class VisitormanagementTest extends ComponentTest {

  private VisitorEto visitorEto = new VisitorEto();

  @Inject
  private Visitormanagement visitormanagement;

  @Override
  protected void doSetUp() {

    super.doSetUp();
    this.visitorEto.setName("Mary");
    this.visitorEto.setUsername("mary@mary.com");
    this.visitorEto.setPhoneNumber("123456789");
    this.visitorEto.setPassword("test");
    this.visitorEto.setUserType(false);
    this.visitorEto.setAcceptedTerms(true);
    this.visitorEto.setAcceptedCommercial(true);
  }

  @Test
  @Ignore
  public void saveVisitorTest() {

    VisitorEto visitorEtoResult = this.visitormanagement.saveVisitor(this.visitorEto);

    assertThat(visitorEtoResult.getId()).isNotNull();
    assertThat(visitorEtoResult.getName()).isEqualTo("Mary");

    this.visitormanagement.deleteVisitor(visitorEtoResult.getId());
  }

  @Test
  @Ignore
  public void findVisitorsTest() {

    VisitorSearchCriteriaTo criteria = new VisitorSearchCriteriaTo();
    Pageable pageable = PageRequest.of(0, 100);
    criteria.setPageable(pageable);
    Page<VisitorEto> result = this.visitormanagement.findVisitors(criteria);

    assertThat(result).isNotNull();
  }
}
