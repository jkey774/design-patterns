package com.designpatterns.structural.bridge;

public class Main {

    public static void main(String[] args) {

        RemoteControl sonyRemoteControl = new RemoteControl(new SonyTV());

        sonyRemoteControl.turnOn();


        RemoteControl samsungRemoteControl = new RemoteControl(new SamsungTV());

        samsungRemoteControl.turnOn();


        AdvancedRemoteControl sonyAdvancedRemoteControl = new AdvancedRemoteControl(new SonyTV());

        sonyAdvancedRemoteControl.setChannel(3);


        AdvancedRemoteControl samsungAdvancedRemoteControl = new AdvancedRemoteControl(new SamsungTV());

        samsungAdvancedRemoteControl.setChannel(3);

    }

}
