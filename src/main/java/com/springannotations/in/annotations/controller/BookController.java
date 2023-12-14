package com.springannotations.in.annotations.controller;

import com.springannotations.in.annotations.beans.Book;
import com.springannotations.in.annotations.beans.TicketDetails;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

//@Controller
//@ResponseBody
@RestController
@RequestMapping("/api")
public class BookController {

    @RequestMapping("/hello-world")
//    @ResponseBody
    public String helloWorld(){
        return "Hello World";
    }


    @GetMapping(value = {"/book","/java"})

//    method = RequestMethod.GET
//          produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_ATOM_XML_VALUE},
//            consumes = {MediaType.APPLICATION_ATOM_XML_VALUE,MediaType.APPLICATION_JSON_VALUE}
//
//
    @ResponseBody
    public Book getBook(){
        Book book = new Book(1,"CoreJava","Learn Core Java and Features","Aravind");
      return book;
    }




 @PostMapping(value = "/books/create",
 consumes = MediaType.APPLICATION_JSON_VALUE
 )
 @ResponseBody
    public Book createBook(@RequestBody Book book){
        System.out.println(book.getId());
        System.out.println(book.getDescription());
        System.out.println(book.getTitle());
        System.out.println(book.getAdduser());
        return book;
    }


    @GetMapping  ("/gh/{str}")
    public String printUser(@PathVariable String str){
        return str;

    }

//    @PutMapping(value = "/books/update/{id}")
//    public ResponseEntity<Book> updateBook(@PathVariable int id,@RequestBody Book updateBook){
//        System.out.println(id);
//        System.out.println(updateBook.getTitle());
//        System.out.println(updateBook.getDescription());
//        updateBook.setId(id);
//        return ResponseEntity.ok(updateBook);
//    }


    @GetMapping("/ticket")
    public List<TicketDetails> getInfo(){
        List<TicketDetails> details = new ArrayList<>();
        details.add(new TicketDetails("Aravind","Trivandrium",2));
        details.add(new TicketDetails("Sreeakanth","KanjjramparA",3));
        return details;

    }

    @GetMapping("ticket/{name}/{destination}/{id}")
    public TicketDetails ticketPathVariable(@PathVariable("name") String name,@PathVariable("destination") String destination,@PathVariable("id") int id){
        return new TicketDetails(name,destination,id);
    }







}
