package ontology;

import java.util.Objects;

public class Info {

    private String label;
    private String id;
    private String definition;
    private String subClass;
    private String iconName;

    public Info(String label, String id, String definition, String subClass) {
        this.label = label;
        this.id = id;
        this.definition = definition;
        this.subClass = subClass;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    public String getSubClass() {
        return subClass;
    }

    public void setSubClass(String subClass) {
        this.subClass = subClass;
    }

    public String getIconName() {
        return iconName;
    }

    public void setIconName(String iconName) {
        this.iconName += iconName+"|";
    }

    @Override
    public String toString() {
        return "Info{" + "label=" + label + ", id=" + id + ", definition=" + definition + ", subClass=" + subClass + ", iconName=" + iconName + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.label);
        hash = 29 * hash + Objects.hashCode(this.id);
        hash = 29 * hash + Objects.hashCode(this.definition);
        hash = 29 * hash + Objects.hashCode(this.subClass);
        return hash;
    }
    
    

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Info other = (Info) obj;
        if (!this.label.equals(other.label)) {
            return false;
        }
        if (!this.id.equals(other.id)) {
            return false;
        }
        if (!this.definition.equals(other.definition)) {
            return false;
        }
        return this.subClass.equals(other.subClass);
    }

}
