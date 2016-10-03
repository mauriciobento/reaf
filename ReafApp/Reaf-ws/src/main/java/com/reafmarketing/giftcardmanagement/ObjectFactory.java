
package com.reafmarketing.giftcardmanagement;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.reafmarketing.giftcardmanagement package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CompanyCard_QNAME = new QName("http://www.reafmarketing.com/GiftCardManagement/", "companyCard");
    private final static QName _ReportAccessCard_QNAME = new QName("http://www.reafmarketing.com/GiftCardManagement/", "reportAccessCard");
    private final static QName _GiftCardException_QNAME = new QName("http://www.reafmarketing.com/GiftCardManagement/", "GiftCardException");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.reafmarketing.giftcardmanagement
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CompanyCard }
     * 
     */
    public CompanyCard createCompanyCard() {
        return new CompanyCard();
    }

    /**
     * Create an instance of {@link ReportCompanyCard }
     * 
     */
    public ReportCompanyCard createReportCompanyCard() {
        return new ReportCompanyCard();
    }

    /**
     * Create an instance of {@link GiftCardException }
     * 
     */
    public GiftCardException createGiftCardException() {
        return new GiftCardException();
    }

    /**
     * Create an instance of {@link ReportCompanyCardDetail }
     * 
     */
    public ReportCompanyCardDetail createReportCompanyCardDetail() {
        return new ReportCompanyCardDetail();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompanyCard }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.reafmarketing.com/GiftCardManagement/", name = "companyCard")
    public JAXBElement<CompanyCard> createCompanyCard(CompanyCard value) {
        return new JAXBElement<CompanyCard>(_CompanyCard_QNAME, CompanyCard.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReportCompanyCard }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.reafmarketing.com/GiftCardManagement/", name = "reportAccessCard")
    public JAXBElement<ReportCompanyCard> createReportAccessCard(ReportCompanyCard value) {
        return new JAXBElement<ReportCompanyCard>(_ReportAccessCard_QNAME, ReportCompanyCard.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GiftCardException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.reafmarketing.com/GiftCardManagement/", name = "GiftCardException")
    public JAXBElement<GiftCardException> createGiftCardException(GiftCardException value) {
        return new JAXBElement<GiftCardException>(_GiftCardException_QNAME, GiftCardException.class, null, value);
    }

}
