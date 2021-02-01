package com.sai.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Table(name = "CO_TRIGGERSs")
@Entity
@Data
public class CoTriggers {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "TRG_ID")
	private Integer trgId;
	@Column(name = "CASE_NUM")
	private Integer caseNum;
	@Column(name = "CREATE_DT")
	private LocalDate createDt;
	@Column(name = "TRG_STATUS")
	private String trgStatus;
	@Column(name = "UPDATE_DT")
	private LocalDate updateDt;

}
