package developer.days.sailpoint.object;

import sailpoint.object.SailPointObject;
import sailpoint.object.Identity;

public class BusinessApplication extends SailPointObject {
    private static final long serialVersionUID=1L;

    private Identity custodian;
    private Identity approversWorkgroup;
    private String cmdbId;
    private String approvalMode;
    private String severity;
    private String criticality;

    public String getCriticality() {
        return criticality;
    }

    public void setCriticality(String criticality) {
        this.criticality = criticality;
    }

    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public String getApprovalMode() {
        return approvalMode;
    }

    public void setApprovalMode(String approvalMode) {
        this.approvalMode = approvalMode;
    }

    public String getCmdbId() {
        return cmdbId;
    }

    public void setCmdbId(String cmdbId) {
        this.cmdbId = cmdbId;
    }

    public Identity getApproversWorkgroup() {
        return approversWorkgroup;
    }

    public void setApproversWorkgroup(Identity approversWorkgroup) {
        this.approversWorkgroup = approversWorkgroup;
    }

    public Identity getCustodian() {
        return custodian;
    }

    public void setCustodian(Identity custodian) {
        this.custodian = custodian;
    }



}