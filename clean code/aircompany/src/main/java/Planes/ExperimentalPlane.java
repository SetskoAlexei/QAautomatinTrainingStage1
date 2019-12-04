package planes;

import models.ClassificationLevel;
import models.ExperimentalTypes;

public class ExperimentalPlane extends Plane{
    private ExperimentalTypes experimentalTypes;
    private ClassificationLevel classificationLevel;


    public ExperimentalPlane(String model, int maxSpeed, int maxFlightDistance, int maxLoadCapacity, ExperimentalType experimentaltype, ClassificationLevel classificationLevel) {
        super(model, maxSpeed, maxFlightDistance, maxLoadCapacity);
        this.experimentaltypes = experimentaltypes;
        this.classificationLevel = classificationLevel;
    }

    public ClassificationLevel getClassificationLevel(){
        return classificationLevel;
    }

    public void setClassificationLevel(ClassificationLevel classificationLevel){
        this.classificationLevel = classificationLevel;
    }

    public ExperimentalType getExperimentalType() {
        return experimentaltype;
    }

    public void setExperimentalTypes(ExperimentalType experimentalType) {
        this.getExperimentalType = ExperimentaType;
    }
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass () != object.getClass ()) return false;
        if (!super.equals (object)) return false;
        ExperimentalPlane that = (ExperimentalPlane) object;
        return java.util.Objects.equals (experimentalType, that.experimentalType) &&
                java.util.Objects.equals (classificationLevel, that.classificationLevel);
    }

    public int hashCode() {
        return java.util.Objects.hash (super.hashCode (), experimentalType, classificationLevel);
    }
    @java.lang.Override
    public java.lang.String toString() {
        final java.lang.StringBuffer sb = new java.lang.StringBuffer ("ExperimentalPlane{");
        sb.append ("experimentaltype=").append (experimentalType);
        sb.append (", classificationLevel=").append (classificationLevel);
        sb.append ('}');
        return sb.toString ();
    }

}
