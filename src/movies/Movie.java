package movies;

public class Movie {
    // It should have private fields for name and category,
    private String name;
    private String category;

    // a constructor that sets both of these.
    public Movie(String anotherName, String anotherCategory) {
        this.name = anotherName;
        this.category = anotherCategory;
    }


    // Create methods to access these properties and change them (getters and setters).
    // getters
    public String getName(){
        return this.name;
    }
    public String getCategory(){
        return this.category;
    }

    // setters
    public void setName(String aName) {
        this.name = aName;
    }
    public void setCategory(String aCategory) {
        this.category = aCategory;
    }


}
