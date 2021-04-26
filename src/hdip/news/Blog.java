package hdip.news;

class Blog extends Online implements Subjective {//class extends abstract class and implements subj interface

    private String theEditor;

    Blog(String aName, String aEditor) {//imported constrtuctor and added arguments
        super(aName);//imported super automatically
        theEditor = aEditor;
    }

    @Override
    public String getEditor() {
        return theEditor;
    }

    @Override
    public String toString() {
        return super.toString() + " whose editor is " + getEditor();//call super.toString - access to Print class and take the to string

    }

}
