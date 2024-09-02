package mvc.entity;

import javax.persistence.*;

@Entity
@Table(name = "book")
public class BookEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;


    @Column(name = "name")
    private String name;

    @Column(name = "author")
    private String author;

    @ManyToOne
    @JoinColumn(name = "categoryId", nullable = false) // Thêm nullable = false nếu category là bắt buộc
    private CategoryEntity category;

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "book", orphanRemoval = true)
    private BookDetailsEntity bookDetails;

    public BookEntity(int id, BookDetailsEntity bookDetails, CategoryEntity category, String author, String name) {
        this.id = id;
        this.bookDetails = bookDetails;
        this.category = category;
        this.author = author;
        this.name = name;
    }

    public BookEntity() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public BookDetailsEntity getBookDetails() {
        return bookDetails;
    }

    public void setBookDetails(BookDetailsEntity bookDetails) {
        this.bookDetails = bookDetails;
    }

    public CategoryEntity getCategory() {
        return category;
    }

    public void setCategory(CategoryEntity category) {
        this.category = category;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
