package hdip.news;

public abstract class Online implements NewsMedia {

    private String theName;

    public Online(String aName) {

        theName = aName;

    }

    @Override
    public String getName() {
        return theName;

    }

    @Override
    public String toString() {
        return "Name is\t" + getName();

    }

    @Override
    public abstract String getEditor();
}
