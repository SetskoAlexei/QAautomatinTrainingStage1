package collections.mainTask.accesories;


import collections.mainTask.types.TypeFeather;

public class Feathers extends Accessories {
    private TypeFeather typeFeather;
    private int length;
    private String color;

    public Feathers(String nameAccessories, TypeFeather typeFeather, int length, String color, float cost) {
        super (nameAccessories,  cost);
        this.typeFeather = typeFeather;
        this.length = length;
        this.color = color;
    }

    public TypeFeather getTypeFeather() {
        return typeFeather;
    }

    public void setTypeFeather(TypeFeather typeFeather) {
        this.typeFeather = typeFeather;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer ("Feathers{");
        sb.append ("typeFeather=").append (typeFeather);
        sb.append (", length=").append (length);
        sb.append (", color='").append (color).append ('\'');
        sb.append ('}');
        return sb.toString ();
    }
}
