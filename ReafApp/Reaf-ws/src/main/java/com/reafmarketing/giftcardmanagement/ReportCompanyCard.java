
package com.reafmarketing.giftcardmanagement;

import java.util.ArrayList;
import java.util.List;
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
 * <p>Classe Java de ReportCompanyCard complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ReportCompanyCard">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Report" type="{http://www.reafmarketing.com/GiftCardManagement/}ReportCompanyCardDetail" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportCompanyCard", propOrder = {
    "report"
})
public class ReportCompanyCard
    implements Equals, HashCode, ToString
{

    @XmlElement(name = "Report")
    protected List<ReportCompanyCardDetail> report;

    /**
     * Gets the value of the report property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the report property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReport().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReportCompanyCardDetail }
     * 
     * 
     */
    public List<ReportCompanyCardDetail> getReport() {
        if (report == null) {
            report = new ArrayList<ReportCompanyCardDetail>();
        }
        return this.report;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ReportCompanyCard)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ReportCompanyCard that = ((ReportCompanyCard) object);
        {
            List<ReportCompanyCardDetail> lhsReport;
            lhsReport = (((this.report!= null)&&(!this.report.isEmpty()))?this.getReport():null);
            List<ReportCompanyCardDetail> rhsReport;
            rhsReport = (((that.report!= null)&&(!that.report.isEmpty()))?that.getReport():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "report", lhsReport), LocatorUtils.property(thatLocator, "report", rhsReport), lhsReport, rhsReport)) {
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
            List<ReportCompanyCardDetail> theReport;
            theReport = (((this.report!= null)&&(!this.report.isEmpty()))?this.getReport():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "report", theReport), currentHashCode, theReport);
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
            List<ReportCompanyCardDetail> theReport;
            theReport = (((this.report!= null)&&(!this.report.isEmpty()))?this.getReport():null);
            strategy.appendField(locator, this, "report", buffer, theReport);
        }
        return buffer;
    }

}
