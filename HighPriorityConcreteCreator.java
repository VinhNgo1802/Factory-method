public class HighPriorityConcreteCreator extends RequestCreator {

    @Override
    RequestProduct createRequest() {

        return new HighPriorityConcrete();
    }

}
