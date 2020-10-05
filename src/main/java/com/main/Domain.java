package com.main;

public class Domain {
    private String domainName;
    private double pageAuthority;
    private double domainAuthority;
    private double spamScore;
    private double trustFlow;
    private double citationFlow;

    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public double getPageAuthority() {
        return pageAuthority;
    }

    public void setPageAuthority(double pageAuthority) {
        this.pageAuthority = pageAuthority;
    }

    public double getDomainAuthority() {
        return domainAuthority;
    }

    public void setDomainAuthority(double domainAuthority) {
        this.domainAuthority = domainAuthority;
    }

    public double getSpamScore() {
        return spamScore;
    }

    public void setSpamScore(double spamScore) {
        this.spamScore = spamScore;
    }

    public double getTrustFlow() {
        return trustFlow;
    }

    public void setTrustFlow(double trustFlow) {
        this.trustFlow = trustFlow;
    }

    public double getCitationFlow() {
        return citationFlow;
    }

    public void setCitationFlow(double citationFlow) {
        this.citationFlow = citationFlow;
    }

    public Domain(String domainName, double pageAuthority, double domainAuthority, double spamScore, double trustFlow, double citationFlow) {
        this.domainName = domainName;
        this.pageAuthority = pageAuthority;
        this.domainAuthority = domainAuthority;
        this.spamScore = spamScore;
        this.trustFlow = trustFlow;
        this.citationFlow = citationFlow;
    }
}
