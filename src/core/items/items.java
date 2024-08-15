package items;

enum Unit {
    UNIT,
    KG,
    G,
    L
}

enum Importance{
    NECESSARY,
    IMPORTANT,
    OPTIONAL
}

class Item {
    // attributes
    private String name;
    private float ammount;
    private float threshold;
    private float maxAmmount;
    private Unit unit;
    private Importance importance;
    private float increment;


    // getters and setters7

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public float getAmmount() {
        return ammount;
    }
    public void setAmmount(float ammount) {
        this.ammount = ammount;
    }
    public float getThreshold() {
        return threshold;
    }
    public void setThreshold(float threshold) {
        this.threshold = threshold;
    }
    public float getMaxAmmount() {
        return maxAmmount;
    }
    public void setMaxAmmount(float maxAmmount) {
        this.maxAmmount = maxAmmount;
    }
    public Unit getUnit() {
        return unit;
    }
    public void setUnit(Unit unit) {
        this.unit = unit;
    }
    public Importance getImportance() {
        return importance;
    }
    public void setImportance(Importance importance) {
        this.importance = importance;
    }
    public float getIncrement() {
        return increment;
    }
    public void setIncrement(float increment) {
        this.increment = increment;
    }


    // constructor 

    public Item(String name, float ammount, float threshold, float maxAmmount, Unit unit, Importance importance, float increment) {
        this.name = name;
        this.ammount = ammount;
        this.threshold = threshold;
        this.maxAmmount = maxAmmount;
        this.unit = unit;
        this.importance = importance;
        this.increment = increment;
    }


    //methods

    public boolean shouldIncludeInList(Importance listImportance) //checks if this item should be included in the list 
    {
        return ((this.ammount <= this.threshold) && (listImportance == this.importance));
    }
    public void useUnit()
    {
        this.ammount -= this.increment;
    }
}
