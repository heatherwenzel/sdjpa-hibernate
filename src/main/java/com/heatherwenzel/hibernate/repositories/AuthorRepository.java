package com.heatherwenzel.hibernate.repositories;


import com.heatherwenzel.hibernate.domain.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
