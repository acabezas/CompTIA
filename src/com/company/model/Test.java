package com.company.model;


import java.util.ArrayList;
import java.util.List;

public class Test {
    public int calification = 0;
    public List<Question> questions = new ArrayList<>();


    //Initializing
    {
        questions.add( new Question("A technician replaces a failed hard drive with a brand new one. The technician boots from a\n" +
                "PE CD and attempts to install a custom OS build deployed from the network. The hard\n" +
                "drive is visible in the system’s BIOS. However, once in the preinstallation environment, the\n" +
                "drive is not recognized in the imaging process and the process fails. Which of the following\n" +
                "is MOST likely the cause of failure?\n" +
                "A. The boot CD has failed and needs to be replaced.\n" +
                "B. The hard drive needs to have its configuration manually defined in the BIOS.\n" +
                "C. The PC’s power supply is not providing enough power to the new hard drive.\n" +
                "D. The hard drive has not been partitioned correctly.",
                "D"));
        questions.add( new Question("Which of the following wireless technologies is LEAST likely to be intercepted by a third\n" +
                "party?\n" +
                "A. NFC\n" +
                "B. Bluetooth\n" +
                "C. WiFi\n" +
                "D. Cellular",
                "A"));
        questions.add(new Question("Joe, a user, receives a wireless router from his ISP with a pre-set password and\n" +
                "configuration. He can connect to the router fine via Ethernet but cannot see the wireless\n" +
                "signal on any of his devices. The LEDs on the router indicate that a wireless signal is\n" +
                "broadcasting. Which of the following settings on the router does Joe need to adjust to\n" +
                "enable the devices to see the wireless signal?\n" +
                "A. DHCP\n" +
                "B. IPv6\n" +
                "C. DMZ\n" +
                "D. SSID",
                "D"));

    }
}
