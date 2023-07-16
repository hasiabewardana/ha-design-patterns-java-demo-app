package org.example.designpatterns.creationalpatterns.simplefactory;

public class Subscriber {

    public static void retriveVoicePlans() {
        VoicePlan voicePlan = (VoicePlan) SubscriptionPlanFactory.getSubscriptionPlan("voice");
        System.out.println("Requested voice plans: " +
                ", Plan ID: " + voicePlan.getPlanId() +
                ", Plan Name: " + voicePlan.getPlanName() +
                ", Rental: " + voicePlan.getRental() +
                ", Voice Quota: " + voicePlan.getVoiceQuota());
    }
}
