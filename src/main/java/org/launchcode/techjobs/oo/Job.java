package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    public Job() {
        this.id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    @Override
    public String toString(){
        String newline = System.lineSeparator();
        if ((this.getName()==null) && (this.getEmployer().getValue()==null) && (this.getLocation().getValue()==null) && (this.getPositionType().getValue()==null) && (this.getCoreCompetency().getValue()==null)){
          return "OOPS! This job does not seem to exist.";
        }
        return newline +
                "ID: " + this.id
                + newline +
                "Name: " + (this.name == "" || this.name == null ? "Data not available" : this.name)
                + newline +
                "Employer: " + (this.getEmployer().getValue() == "" || this.getEmployer().getValue() == null ? "Data not available" : this.getEmployer().getValue())
                + newline +
                "Location: " + (this.getLocation().getValue() ==  "" || this.getLocation().getValue() == null ? "Data not available" : this.getLocation().getValue())
                + newline +
                "Position Type: " + (this.getPositionType().getValue() == "" || this.getPositionType().getValue() == null ? "Data not available" : this.getPositionType().getValue())
                + newline +
                "Core Competency: " + (this.getCoreCompetency().getValue() == "" || this.getCoreCompetency().getValue() == null ? "Data not available" : this.getCoreCompetency().getValue())
                + newline;
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return getId() == job.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }


    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }
}
