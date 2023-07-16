package org.example.designpatterns.creationalpatterns.simplefactory;

public class VoicePlan extends SubscriptionPlan {

    private final String voiceQuota;

    public VoicePlan(String planId, String planName, double rental, String voiceQuota) {
        super(planId, planName, rental);
        this.voiceQuota = voiceQuota;
    }

    public String getVoiceQuota() {
        return voiceQuota;
    }

    @Override
    public String toString() {
        return "VoicePlan{" +
                "voiceQuota='" + voiceQuota + '\'' +
                '}';
    }
}
