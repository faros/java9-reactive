package be.faros._01_introduction.solution;

import java.util.concurrent.Flow;

public class MySubscriber implements Flow.Subscriber<String> {

    private Flow.Subscription subscription;

    @Override
    public void onSubscribe(Flow.Subscription subscription) {
        System.out.println("onSubscribe: "+subscription);
        this.subscription = subscription;
        subscription.request(2);
    }

    @Override
    public void onNext(String item) {
        System.out.println("onNext item: "+item);
    }

    @Override
    public void onError(Throwable throwable) {
        System.out.println("onError: "+throwable);
    }

    @Override
    public void onComplete() {
        System.out.println("onComplete");
    }
}
