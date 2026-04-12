package com.library.app.model;

public class FineRule {
    private static FineRule instance;
    private int maximumBorrowDays;
    private long finePerDay;

    private FineRule() {
        this.maximumBorrowDays = 7;
        this.finePerDay = 5000;
    }

    public static FineRule getInstance() {
        if (instance == null) {
            instance = new FineRule();
        }

        return instance;
    }

    public void setMaximumDueDays(int maximumDueDays) {
        this.maximumBorrowDays = maximumDueDays;
    }

    public void setFinePerDay(long finePerDay) {
        this.finePerDay = finePerDay;
    }

    public int getMaximumDueDays() {
        return maximumBorrowDays;
    }

    public long getFinePerDay() {
        return finePerDay;
    }
}
