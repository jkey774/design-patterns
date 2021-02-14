package com.designpatterns.structural.decorator;

public class Main {

    public static void main(String[] args) {

        // storeCreditCard(new CloudStream()); // store as plain text

        // we can wrap (decorate) this CloudStream object
        // with an EncryptedCloudStream

        storeCreditCard(new EncryptedCloudStream(new CloudStream()));

        // or a CompressedCloudStream

        storeCreditCard(new CompressedCloudStream(new CloudStream()));

        // we can also apply multiple decorators to an object

        // for example, first we can compress our data,
        // and then we can encrypt it

        storeCreditCard(new EncryptedCloudStream(new CompressedCloudStream(new CloudStream())));

    }

    // talking to an interface
    public static void storeCreditCard(Stream stream) {
        stream.write("1234-1234-1234-1234");
    }

}
