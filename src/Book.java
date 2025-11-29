public class Book {
    private Integer id;
    private String title;
    private String author;
    private Boolean isIssued=false;
    private Member member;
    public Book(){}
    public Book(Integer id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Boolean getIsIssued() {
        return isIssued;
    }

    public void setIsIssued(Boolean issued) {
        isIssued = issued;
    }

    public void issueTo(Member member){
        if(!isIssued) {
            this.isIssued = true;
            this.member = member;
            System.out.println("Issued to " + this.member.getName());
        }
        else{
            System.out.println("Already Issued to " + this.member.getName());
        }
    }
    public void returnBook(){
        if(this.isIssued){
            System.out.println("Book returned by " + this.member.getName());
            this.member = null;
            this.isIssued = false;
        }
        else
            System.out.println(this.title+" was never issued");
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isIssued=" + isIssued +
                ", member=" + member +
                '}';
    }
}
