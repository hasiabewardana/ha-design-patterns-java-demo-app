package org.example.designpatterns.creationalpatterns.simplefactory;

public abstract class SubscriptionPlan {

    private final String planId;
    private final String planName;
    private final double rental;

    public SubscriptionPlan(String planId, String planName, double rental) {
        this.planId = planId;
        this.planName = planName;
        this.rental = rental;
    }

    public String getPlanId() {
        return planId;
    }

    public String getPlanName() {
        return planName;
    }

    public double getRental() {
        return rental;
    }

    @Override
    public String toString() {
        return "SubscriptionPlan{" +
                "planId='" + planId + '\'' +
                ", planName='" + planName + '\'' +
                ", rental=" + rental +
                '}';
    }
}
