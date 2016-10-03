package test;

import com.reafmarketing.giftcardmanagement.CompanyCard;
import com.reafmarketing.giftcardmanagement.GiftCardException_Exception;
import com.reafmarketing.giftcardmanagement.GiftCardManagement;
import com.reafmarketing.giftcardmanagement.GiftCardManagementWSService;
import com.reafmarketing.giftcardmanagement.ReportCompanyCard;
import com.reafmarketing.giftcardmanagement.ReportCompanyCardDetail;

public class Test {

	public static void main(String[] args) {
		GiftCardManagementWSService ws = new GiftCardManagementWSService();

		GiftCardManagement cardManagement = ws.getGiftCardManagementPort();
		
		CompanyCard card = new CompanyCard();
		card.setName("Volcom");
		
		try {
			
			cardManagement.giftCardSelected(card);
			
			ReportCompanyCard c = cardManagement.reportAccessCard();
			for (ReportCompanyCardDetail detail : c.getReport()) {
				System.out.println(detail.toString());
			}
			
		} catch (GiftCardException_Exception e) {
			e.printStackTrace();
		}

	}

}
