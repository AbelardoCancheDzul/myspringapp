package com.abelardo.springwebapp.controllers;

import com.abelardo.springwebapp.repositories.BookRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //Tag para que spring bean pueda identificarlo como controlador
public class BookController {

    private BookRepository bookRepository; //Obteniendo el repositorio y generando el constructor

    public BookController(BookRepository bookRepository) { //Constructor del repositorio
        this.bookRepository = bookRepository;
    }

    @RequestMapping("/books") //Invoca el path
    public String getBooks(Model model){    //Retorna un string del nombre de la vista y se le pasa el modelo

        model.addAttribute("books",bookRepository.findAll()); //Agregando un atributo al modelo

        return "books";
    }
}
