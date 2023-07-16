package org.example.designpatterns.creationalpatterns.simplefactory;

public class DataPlan extends SubscriptionPlan {

    private final String dataQuota;

    public DataPlan(String planId, String planName, double rental, String dataQuota) {
        super(planId, planName, rental);
        this.dataQuota = dataQuota;
    }

    public String getDataQuota() {
        return dataQuota;
    }

    @Override
    public String toString() {
        return "DataPlan{" +
                "dataQuota='" + dataQuota + '\'' +
                '}';
    }
}
