package be.faros._01_introduction;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Flow;
import java.util.concurrent.SubmissionPublisher;

public class SubmissionPublisherExample {

    public static void main(String[] args) throws InterruptedException {
        /*
         * TODO 01
         * Execute this main method and explore the console output.
         * Why is nothing being shown?
         */
        SubmissionPublisher<String> sb = new SubmissionPublisher<>();

        sb.subscribe(new MySubscriber());
        sb.submit("item 1");
        sb.submit("item 2");
        sb.submit("item 3");
    }
}