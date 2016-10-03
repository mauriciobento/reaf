
package com.reafmarketing.giftcardmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * <p>Classe Java de ReportCompanyCardDetail complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ReportCompanyCardDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CompanyCard" type="{http://www.reafmarketing.com/GiftCardManagement/}CompanyCard" minOccurs="0"/>
 *         &lt;element name="total" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportCompanyCardDetail", propOrder = {
    "companyCard",
    "total"
})
public class ReportCompanyCardDetail
    implements Equals, HashCode, ToString
{

    @XmlElement(name = "CompanyCard")
    protected CompanyCard companyCard;
    protected int total;

    /**
     * Obtém o valor da propriedade companyCard.
     * 
     * @return
     *     possible object is
     *     {@link CompanyCard }
     *     
     */
    public CompanyCard getCompanyCard() {
        return companyCard;
    }

    /**
     * Define o valor da propriedade companyCard.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyCard }
     *     
     */
    public void setCompanyCard(CompanyCard value) {
        this.companyCard = value;
    }

    /**
     * Obtém o valor da propriedade total.
     * 
     */
    public int getTotal() {
        return total;
    }

    /**
     * Define o valor da propriedade total.
     * 
     */
    public void setTotal(int value) {
        this.total = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ReportCompanyCardDetail)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ReportCompanyCardDetail that = ((ReportCompanyCardDetail) object);
        {
            CompanyCard lhsCompanyCard;
            lhsCompanyCard = this.getCompanyCard();
            CompanyCard rhsCompanyCard;
            rhsCompanyCard = that.getCompanyCard();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "companyCard", lhsCompanyCard), LocatorUtils.property(thatLocator, "companyCard", rhsCompanyCard), lhsCompanyCard, rhsCompanyCard)) {
                return false;
            }
        }
        {
            int lhsTotal;
            lhsTotal = (true?this.getTotal(): 0);
            int rhsTotal;
            rhsTotal = (true?that.getTotal(): 0);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "total", lhsTotal), LocatorUtils.property(thatLocator, "total", rhsTotal), lhsTotal, rhsTotal)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = 1;
        {
            CompanyCard theCompanyCard;
            theCompanyCard = this.getCompanyCard();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "companyCard", theCompanyCard), currentHashCode, theCompanyCard);
        }
        {
            int theTotal;
            theTotal = (true?this.getTotal(): 0);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "total", theTotal), currentHashCode, theTotal);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    public String toString() {
        final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        {
            CompanyCard theCompanyCard;
            theCompanyCard = this.getCompanyCard();
            strategy.appendField(locator, this, "companyCard", buffer, theCompanyCard);
        }
        {
            int theTotal;
            theTotal = (true?this.getTotal(): 0);
            strategy.appendField(locator, this, "total", buffer, theTotal);
        }
        return buffer;
    }

}
