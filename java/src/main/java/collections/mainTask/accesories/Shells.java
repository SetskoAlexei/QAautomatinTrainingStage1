package collections.mainTask.accesories;


import collections.mainTask.types.ShellsSize;

public class Shells extends Accessories {
    private ShellsSize shellsSize;

    public Shells(String nameAccessories, ShellsSize shellsSize, float cost) {
        super (nameAccessories, cost);
        this.shellsSize = shellsSize;
    }

    public ShellsSize getShellsSize() {
        return shellsSize;
    }

    public void setShellsSize(ShellsSize shellsSize) {
        this.shellsSize = shellsSize;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer ("Shells{");
        sb.append ("shellsSize=").append (shellsSize);
        sb.append ('}');
        return sb.toString ();
    }
}
