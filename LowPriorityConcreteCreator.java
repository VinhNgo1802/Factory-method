public class LowPriorityConcreteCreator extends RequestCreator {

    @Override
    RequestProduct createRequest() {

        return new LowPriorityConcrete();
    }

}
