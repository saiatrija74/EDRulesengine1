package com.sai.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Table(name = "ELIGIBILITY_DETAILS")
@Entity
@Data
public class EligibilityDetail {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ED_TRACE_ID")
	private Integer edTraceId;
	@Column(name = "BENEFIR_AMT")
	private String benefitAmt;
	@Column(name = "CASE_NUM")
	private Integer caseNum;
	@Column(name = "CREATE_DATE")
	private LocalDate create_dt;
	@Column(name = "DENAIL_REASON")
	private String denial_reason;
	@Column(name = "PLAN_END_DATE")
	private String planEndDt;
	@Column(name = "PLAN_NAME")
	private String plan_name;
	@Column(name = "PLAN_START_DATE")
	private String plan_start_dt;
	@Column(name = "PLAN_STATUS")
	private String plan_status;
	@Column(name = "UPDATE_DATE")
	private String update_dt;

}
