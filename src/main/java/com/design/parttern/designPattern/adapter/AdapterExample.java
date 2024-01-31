package com.design.parttern.designPattern.adapter;

public class AdapterExample {
    public static void main(String[] args) {
        AndroidCharger androidCharger = new AndroidCharger();
        AndroidPhone androidPhone = new OnePlus();
        androidCharger.charge(androidPhone);

        IPhoneCharger iPhoneCharger = new IPhoneCharger();
        IPhone iPhone = new IPhoneX();
        iPhoneCharger.charge(iPhone);

        AndroidToIphoneAdapter adapter = new AndroidToIphoneAdapter(androidPhone);
        iPhoneCharger.charge(adapter);
    }
}
