package com.library.service;

import com.library.repository.BookRepository;

public class BookService {

    private BookRepository bookRepository;

    // Setter for Dependency Injection
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    // Just for testing DI is working
    public void listBooks() {
        System.out.println("Fetching books from the repository...");
        bookRepository.fetchBooks();
    }
}

