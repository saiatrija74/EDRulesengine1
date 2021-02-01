package com.sai.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Table(name = "CO_PDFS")
@Entity
@Data
public class CoPDFs {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CO_PDF_ID")
	private Integer coPdfId;
	@Column(name = "PLAN_STATUS")
	private String planStatus;
	@Column(name = "CASE_NUMBER")
	private String caseNumber;
	@Column(name = "PLAN_NAME")
	private String planNumber;
	@Column(name = "PDF_DOCUMENT")
	private Byte[] pdfDocument;

}
