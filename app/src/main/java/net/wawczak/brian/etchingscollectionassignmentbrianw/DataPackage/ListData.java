package net.wawczak.brian.etchingscollectionassignmentbrianw.DataPackage;

public class ListData {

    private String bookTitle;
    private String bookAuthor;
    private String subjectType;
    private String bookDescription;


    public ListData() {
    }

    public ListData(String bookTitle, String bookAuthor, String subjectType, String bookDescription) {
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.subjectType = subjectType;
        this.bookDescription = bookDescription;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getSubjectType() {
        return subjectType;
    }

    public void setSubjectType(String subjectType) {
        this.subjectType = subjectType;
    }

    public String getBookDescription() {
        return bookDescription;
    }

    public void setBookDescription(String bookDescription) {
        this.bookDescription = bookDescription;
    }

    @Override
    public String toString() {
        return "ListData{" +
                "bookTitle='" + bookTitle + '\'' +
                ", bookAuthor='" + bookAuthor + '\'' +
                ", subjectType='" + subjectType + '\'' +
                ", bookDescription='" + bookDescription + '\'' +
                '}';
    }
}
