package com.reaf.controllers;

import java.io.Serializable;
import java.util.List;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import com.reaf.service.GirftCardService;
import com.reafmarketing.giftcardmanagement.CompanyCard;
import com.reafmarketing.giftcardmanagement.GiftCardException_Exception;
import com.reafmarketing.giftcardmanagement.ReportCompanyCardDetail;

@Named
@RequestScoped
public class CardGiftController implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6921492509616388221L;

	private String name;
	
	@EJB
	private GirftCardService cardService;
	
	private List<ReportCompanyCardDetail> report;
	
	/**
	 * 
	 */
	public void onCardGift(){
		CompanyCard companyCard = new CompanyCard();
		companyCard.setName(name);
		try {
			cardService.saveGiftCard(companyCard);
		} catch (GiftCardException_Exception e) {
			e.printStackTrace();
		}
	}
	
	public void onReportCardsSelected(){
		try {
			report = cardService.report();
		} catch (GiftCardException_Exception e) {
			e.printStackTrace();
		}
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<ReportCompanyCardDetail> getReport() {
		onReportCardsSelected();
		return report;
	}

	public void setReport(List<ReportCompanyCardDetail> report) {
		this.report = report;
	}

}
