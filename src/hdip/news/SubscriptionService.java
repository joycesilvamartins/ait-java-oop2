package hdip.news;

class SubscriptionService extends Online {

    private String theEditor;

    SubscriptionService(String aName, String aEditor) {
        super(aName);
        theEditor = aEditor;
    }

    @Override
    public String getEditor() {
        return theEditor;
    }

    @Override
    public String toString() {
        return super.toString() + "whose editor is " + getEditor();

    }

}
