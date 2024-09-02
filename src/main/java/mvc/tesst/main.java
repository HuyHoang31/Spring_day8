package mvc.tesst;

import mvc.config.conFig;
import mvc.entity.BookEntity;
import mvc.repository.BookRepository;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class main {
    static ApplicationContext context=new AnnotationConfigApplicationContext(conFig.class);
    static BookRepository bookRepository = (BookRepository) context.getBean("productRepon");

//    public static void main(String[] args) {
////        createCustomer();
//        create();
//    }
////    public static void create(){
////         BookEntity b = new BookEntity();
////         b.setId(1);
////        if(pd!=null){
////            System.out.println("them thanh cong "+pd);
////        }
////    }
}
