package com.design.parttern.designPattern.adapter;

public class AndroidToIphoneAdapter implements IPhone{

    AndroidPhone androidPhone;

    public AndroidToIphoneAdapter(AndroidPhone androidPhone){
        this.androidPhone = androidPhone;
    }
    @Override
    public void charge() {
        androidPhone.charge();
    }
}
