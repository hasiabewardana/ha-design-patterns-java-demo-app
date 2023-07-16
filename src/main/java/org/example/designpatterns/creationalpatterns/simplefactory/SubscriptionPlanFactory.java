package org.example.designpatterns.creationalpatterns.simplefactory;

public class SubscriptionPlanFactory {

    public static SubscriptionPlan getSubscriptionPlan(String planType) {
        switch (planType) {
            case "voice":
                return new VoicePlan("VOICE_PLAN_1", "Voice plan 1", 300.00, "200mins");
            case "data":
                return new DataPlan("DATA_PLAN_1", "Data plan 1", 400.00, "5GB");
            default:
                throw new IllegalArgumentException("PlanType is unknown.");
        }
    }
}
