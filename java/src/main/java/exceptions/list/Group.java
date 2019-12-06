package exceptions.list;

public class Group extends Faculty {
    int group;

    public Group(String faculty, int group) {
        super (faculty);
        this.group = group;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }
}
