package ontology;

public class Info {
	private String label;
	private String id;
        private String definition;
        private String subClass;
	private String iconName;

    public Info(String label, String id, String definition, String subClass, String iconName) {
        this.label = label;
        this.id = id;
        this.definition = definition;
        this.subClass = subClass;
        this.iconName = iconName;
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
        this.iconName = iconName;
    }

	
        
	
}
