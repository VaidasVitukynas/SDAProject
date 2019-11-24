package lt.sdacademy.Fundamentalscoding.practicalexercises.reversetext.triangles;


public enum  TriangleType {
    EQUILATERAL("Lygiakrastis"),
    EQUAL_SIDE("Lygiasonis"),
    OBTUSE("Bukas");

    private String triangleDescription;

    TriangleType(String triangleDescription) {
        this.triangleDescription = triangleDescription;
    }

    public String getTriangleDescription() {
        return  triangleDescription;
    }

}
