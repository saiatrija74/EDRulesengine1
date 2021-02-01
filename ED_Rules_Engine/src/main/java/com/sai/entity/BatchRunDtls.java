package com.sai.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Table(name = "BATCH_RUN_DTLS")
@Entity
@Data
public class BatchRunDtls {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "BATCH_RUN_SEQ")
	private Integer batchRunSeq;
	@Column(name = "BATCH_NAME")
	private String batchName;
	@Column(name = "BATCH_RUN_STATUS")
	private String batchRunStatus;
	@Column(name = "END_DATE")
	private LocalDateTime endDate;
	@Column(name = "INSTANCE_NUM")
	private Integer instanceNumber;
	@Column(name = "START_DATE")
	private LocalDateTime startDate;

}
