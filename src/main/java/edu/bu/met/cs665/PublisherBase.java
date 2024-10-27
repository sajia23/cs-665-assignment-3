/**
 * Name: Shaohua Yue
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/27/2024
 * File Name: PublisherBase.java
 * Description: This class defines method for publisher
 */
package edu.bu.met.cs665;

public interface PublisherBase {
    void subscribe(SubscriberBase o);

    void unsubscribeAll();

    void notifySubscribers(Email email);
}
