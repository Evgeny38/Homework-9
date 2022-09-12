public class Author {
    private final String name;
    private final String surname;
//    private String Author;


    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
//    public String getAuthor(String name, String surname){
//        return Author;
                
//    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public String toString() {
        return "Автор : " + this.name +" " + this.surname;
    }

}
