
package com.demo.entity;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@Entity
@EqualsAndHashCode
@NoArgsConstructor
public class Book {


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	private String name;

	@ManyToOne
	private Author author;

    public Book(String nameOfBook) {
        this.name = nameOfBook;
    }
}

