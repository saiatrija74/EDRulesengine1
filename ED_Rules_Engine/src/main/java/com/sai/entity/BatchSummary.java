package com.sai.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Table(name = "BATCH_SUMMARY")
@Entity
@Data
public class BatchSummary {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "SUMMARY_ID")
	private Integer summaryId;
	@Column(name = "BATCH_NAME")
	private String batchName;
	@Column(name = "FAILURE_TRIGGER_COUNT")
	private Integer failureTriggerCount;
	@Column(name = "SUCCESS_TRIGGER_COUNT")
	private Integer successTriggerCount;
	@Column(name = "TOTAL_TRIGGER_PROCESSED")
	private Integer TotalTriggerProcess;

}
