package hdip.news;

public abstract class Print implements NewsMedia {

    private String theName;

    public Print(String aName) {//constructor(exigir alguma info)
        theName = aName;
    }

    @Override
    public String getName() {
        return theName;

    }
    
        @Override
    public abstract String getEditor();

    @Override
    public String toString() {//super access the Object class(acessar a super classe-classe pai) 
        return "Name is\t" + getName();

    }

}
