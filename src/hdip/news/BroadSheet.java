package hdip.news;

class BroadSheet extends Print {

    private String theEditor;

    BroadSheet(String aName, String aEditor) {
        super(aName);
        theEditor = aEditor;
    }

    @Override
    public String getEditor() {

        return theEditor;
    }

    @Override
    public String toString() {
        return super.toString() + " whose editor is " + getEditor();
    }

}
