package com.reaf.service;

import java.io.Serializable;
import java.util.List;

import javax.ejb.Asynchronous;
import javax.ejb.Stateless;
import javax.inject.Inject;

import com.reafmarketing.giftcardmanagement.CompanyCard;
import com.reafmarketing.giftcardmanagement.GiftCardException_Exception;
import com.reafmarketing.giftcardmanagement.GiftCardManagement;
import com.reafmarketing.giftcardmanagement.GiftCardManagementWSService;
import com.reafmarketing.giftcardmanagement.ReportCompanyCardDetail;

@Stateless
public class GirftCardService implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5314980825745833297L;
	
	@Inject
	GiftCardManagementWSService service;

	@Asynchronous
	public void saveGiftCard(CompanyCard companyCard)throws GiftCardException_Exception{
		GiftCardManagement cardManagement = service.getGiftCardManagementPort();
		cardManagement.giftCardSelected(companyCard);
	}
	
	public List<ReportCompanyCardDetail> report() throws GiftCardException_Exception{
		GiftCardManagement cardManagement = service.getGiftCardManagementPort();
		return cardManagement.reportAccessCard().getReport();
	}

}
