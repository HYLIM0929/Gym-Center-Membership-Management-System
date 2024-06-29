
public abstract class Member {
    private String memberId;
    private String name;

    public Member(String memberId, String name) {
        this.memberId = memberId;
        this.name = name;
    }

    public String getMemberId() {
        return memberId;
    }

    public String getName() {
        return name;
    }

    public abstract double feePerVisit();

    @Override
    public String toString() {
        return "Member{" + "memberId='" + memberId + '\'' + ", name='" + name + '\'' +'}';
    }
}

class PlatinumMember extends Member {
    private double monthlyFee;
    private int maxVisitsPerMonth;

    public PlatinumMember(String memberId, String name, double monthlyFee, int maxVisitsPerMonth) {
        super(memberId, name);
        this.monthlyFee = monthlyFee;
        this.maxVisitsPerMonth = maxVisitsPerMonth;
    }

    public double getMonthlyFee() {
        return monthlyFee;
    }

    public int getMaxVisitsPerMonth() {
        return maxVisitsPerMonth;
    }

    @Override
    public double feePerVisit() {
        return monthlyFee / 12;
    }

    @Override
    public String toString() {
        return "PlatinumMember{" +"memberId='" + getMemberId() + '\'' + ", name='" + getName() + '\'' + ", monthlyFee=" + monthlyFee +", maxVisitsPerMonth=" + maxVisitsPerMonth +'}';
    }
}

class SilverMember extends Member {
    private double annualFee;
    private int visitsPerYear;

    public SilverMember(String memberId, String name, double annualFee, int visitsPerYear) {
        super(memberId, name);
        this.annualFee = annualFee;
        this.visitsPerYear = visitsPerYear;
    }

    public double getAnnualFee() {
        return annualFee;
    }

    public int getVisitsPerYear() {
        return visitsPerYear;
    }

    @Override
    public double feePerVisit() {
        return annualFee / visitsPerYear;
    }

    @Override
    public String toString() {
        return "SilverMember{" +"memberId='" + getMemberId() + '\'' +", name='" + getName() + '\'' +", annualFee=" + annualFee +", visitsPerYear=" + visitsPerYear +'}';
    }
}
