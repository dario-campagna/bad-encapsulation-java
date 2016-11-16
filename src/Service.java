public class Service {

    private Collaborator collaborator;
    private int requests = 0;

    public void onEvent() {
        if (requests < Singleton.getInstance().getLimit()) {
            collaborator.doSomething();
            requests++;
        }
    }

}
