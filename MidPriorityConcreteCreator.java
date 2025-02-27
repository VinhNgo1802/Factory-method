public class MidPriorityConcreteCreator extends RequestCreator {

    @Override
    RequestProduct createRequest() {

        return new MidPriorityConcrete();
    }

}
